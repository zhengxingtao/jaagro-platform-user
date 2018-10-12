package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.EmployeeRole;

import java.util.List;

/**
 * @author tony
 */
public interface EmployeeRoleMapperExt extends EmployeeRoleMapper {

    /**
     * 查询
     *
     * @param roleId
     * @return
     */
    List<EmployeeRole> listByRoleId(Integer roleId);

    /**
     * 根据员工id删除
     *
     * @param employeeId
     * @return
     */
    int deleteByEmpId(Integer employeeId);

    /**
     * 逻辑删除 根据员工id
     *
     * @param employeeId
     * @return
     */
    int disableByEmpId(Integer employeeId);

    /**
     * 根据员工查询
     * @param id
     * @return
     */
    List<EmployeeRole> listByEmpId(Integer id);
}