package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;

import java.util.Map;

/**
 * @author baiyiran
 */
public interface RoleService {

    /**
     * 新增角色
     *
     * @param dto
     */
    Map<String, Object> createRole(CreateRoleDto dto);

    /**
     * 修改角色
     *
     * @param dto
     */
    Map<String, Object> updateRole(UpdateRoleDto dto);

    /**
     * 删除[逻辑]
     *
     * @param id
     * @return
     */
    Map<String, Object> deleteById(Integer id);

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    Map<String, Object> getRoleDetailById(Integer id);

    /**
     * 分页查询角色
     *
     * @return
     */
    Map<String, Object> listRole(ListRoleCriteriaDto dto);
}
