package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateDepartmentDto;
import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDepartmentDto;

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
    /**
     * 获取单条
     *
     * @param id
     * @return
     */
    Map<String, Object> getById(Long id);
    /**
     * 逻辑删除部门
     *
     * @param id
     * @return
     */
    Map<String, Object> disableDepartment(Long id);
    /**
     * 分页获取list，注意criteria查询条件
     *
     * @param dto
     * @return
     */
    Map<String, Object> listByCriteria(ListDepartmentCriteriaDto dto);
}
