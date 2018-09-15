package com.jaagro.user.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jaagro.user.api.dto.request.CreateDepartmentDto;
import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDepartmentDto;
import com.jaagro.user.api.dto.response.DepartmentReturnDto;
import com.jaagro.user.api.service.DepartmentService;
import com.jaagro.user.biz.entity.Department;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.DepartmentMapperExt;
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

    /**
     * 创建部门
     *
     * @param dto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> createDepartment(CreateDepartmentDto dto) {
        //创建部门对象
        Department department = new Department();
        BeanUtils.copyProperties(dto, department);
        department
                .setCreateTime(new Date())
                .setEnabled(true);
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
                .setCreateTime(new Date());
        departmentMapper.updateByPrimaryKeySelective(department);
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
        return ServiceResult.toResult(departmentMapper.getById(id));
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
        DepartmentReturnDto departmentDto = departmentMapper.getById(id);
        //创建部门对象
        Department department = new Department();
        BeanUtils.copyProperties(departmentDto, department);
        if (department != null) {
            //逻辑删除部门
            department.setEnabled(false);
            departmentMapper.updateByPrimaryKeySelective(department);
        }
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
}
