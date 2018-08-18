package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.department.CreateDepartmentDto;
import com.jaagro.user.api.dto.request.department.UpdateDepartmentDto;

import java.util.Map;

/**
 * @author tony
 */
public interface DepartmentService {
    /**
     * 创建部门
     * @param dto
     * @return
     */
    Map<String, Object> createDepartment(CreateDepartmentDto dto);
    /**
     * 修改部门
     * @param dto
     * @return
     */
    Map<String, Object> updateById(UpdateDepartmentDto dto);
}
