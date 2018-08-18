package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.department.CreateDepartmentDto;
import com.jaagro.user.api.dto.request.department.UpdateDepartmentDto;
import com.jaagro.user.api.service.DepartmentService;
import com.jaagro.user.biz.entity.Department;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.ServiceResult;

import java.util.Date;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private UserMapper userMapper;
    /**
     * 创建部门
     * @param dto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> createDepartment(CreateDepartmentDto dto) {
        //创建部门对象
        Department department=new Department();
        BeanUtils.copyProperties(dto,department);
        department
                .setCreateTime(new Date())
                .setEnabled(true);
        departmentMapper.insert(department);
        return ServiceResult.toResult("部门创建成功");
    }

    /**
     * 修改部门
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> updateById(UpdateDepartmentDto dto) {
        //创建部门对象
        Department department=new Department();
        BeanUtils.copyProperties(dto,department);
        department
                .setCreateTime(new Date());
        departmentMapper.updateByPrimaryKeySelective(department);
        return ServiceResult.toResult("修改部门成功");
    }
}
