package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.UpdateEmpRoleDto;

import java.util.List;
import java.util.Map;

/**
 * @author baiyiran
 */
public interface EmployeeRoleService {

    /**
     * 新增员工角色
     *
     * @return
     */
    Map<String, Object> createEmp(Long[] roleIds, Long employeeId);

    /**
     * 修改员工角色
     *
     * @return
     */
    Map<String, Object> updateEmpRole(List<UpdateEmpRoleDto> dtos);


}
