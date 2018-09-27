package com.jaagro.user.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jaagro.user.api.dto.request.CreateDepartmentDto;
import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDepartmentDto;
import com.jaagro.user.api.dto.response.DepartmentReturnDto;
import com.jaagro.user.api.dto.response.department.ListDepartmentDto;
import com.jaagro.user.api.service.DepartmentService;
import com.jaagro.user.api.service.UserClientService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.entity.Department;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.DepartmentMapperExt;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import com.jaagro.user.biz.mapper.EmployeeMapperExt;
import com.jaagro.utils.BaseResponse;
import com.jaagro.utils.ResponseStatusCode;
import com.jaagro.utils.ServiceResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author tony
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapperExt departmentMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeMapperExt employeeMapper;

    /**
     * 创建部门
     *
     * @param dto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> createDepartment(CreateDepartmentDto dto) {
        if (dto.getParentId() != null) {
            if (departmentMapper.selectByPrimaryKey(dto.getParentId()) == null) {
                return ServiceResult.error(ResponseStatusCode.QUERY_DATA_ERROR.getCode(), "上级部门不存在");
            }
        }
        if (dto.getLeaderEmployeeId() != null) {
            if (employeeMapper.selectByPrimaryKey(dto.getLeaderEmployeeId()) == null) {
                return ServiceResult.error(ResponseStatusCode.QUERY_DATA_ERROR.getCode(), "主管不存在");
            }
        }
        //创建部门对象
        Department department = new Department();
        BeanUtils.copyProperties(dto, department);
        department
                .setCreateUserId(userService.getCurrentUser().getId());
        departmentMapper.insertSelective(department);
        return ServiceResult.toResult("部门创建成功");
    }

    /**
     * 修改部门
     *
     * @param dto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> updateById(UpdateDepartmentDto dto) {
        //创建部门对象
        Department department = new Department();
        BeanUtils.copyProperties(dto, department);
        department
                .setModifyTime(new Date())
                .setModifyUserId(userService.getCurrentUser().getId());
        departmentMapper.updateByPrimaryKeySelective(department);
        if (dto.getLevel() != null) {
            if (dto.getLevel().equals(1)) {
                if (dto.getParentId() == null) {
                    Department department1 = departmentMapper.selectByPrimaryKey(department.getId());
                    department1.setParentId(null);
                    departmentMapper.updateByPrimaryKey(department1);
                }
            }
        }
        return ServiceResult.toResult("修改部门成功");
    }

    /**
     * 查询单个部门
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getById(Integer id) {

        if (departmentMapper.selectByPrimaryKey(id) == null) {
            return ServiceResult.error(ResponseStatusCode.ID_VALUE_ERROR.getCode(), "id: " + id + "不存在");
        }
        DepartmentReturnDto departmentReturnDto = departmentMapper.getById(id);
        if (departmentReturnDto != null) {
            Department department = departmentMapper.selectByPrimaryKey(departmentReturnDto.getParentId());
            if (department != null) {
                departmentReturnDto.setParentLevel(department.getLevel());
            }
        }
        return ServiceResult.toResult(departmentReturnDto);
    }

    /**
     * 逻辑删除部门
     *
     * @param id
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> disableDepartment(Integer id) {
        //创建部门Dto返回的对象
        Department department = departmentMapper.selectByPrimaryKey(id);
        if (department == null) {
            return ServiceResult.error(ResponseStatusCode.QUERY_DATA_ERROR.getCode(), "部门查询无数据");
        }
        //逻辑删除部门
        department.setEnabled(false);
        departmentMapper.updateByPrimaryKeySelective(department);
        return ServiceResult.toResult("部门删除成功");
    }

    /**
     * 分页获取list，注意criteria查询条件
     *
     * @param dto
     * @return
     */
    @Override

    public Map<String, Object> listByCriteria(ListDepartmentCriteriaDto dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<DepartmentReturnDto> departmentReturnDtos = this.departmentMapper.getByCriteriDto(dto);
        return ServiceResult.toResult(new PageInfo<>(departmentReturnDtos));
    }

    @Override
    public Map<String, Object> listDepartment(Boolean netpoint) {
        return ServiceResult.toResult(this.departmentMapper.listDepartment(netpoint));
    }
}
