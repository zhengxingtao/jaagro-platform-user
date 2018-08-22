package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.ListRolePsDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;

import java.util.List;
import java.util.Map;

/**
 * @author baiyiran
 */
public interface RolePermissionService {

    /**
     * 新增角色权限
     *
     * @param dto
     */
    Map<String, Object> createRole(CreateRoleDto dto);

    /**
     * 修改角色权限
     *
     * @param dto
     */
    Map<String, Object> updateRole(UpdateRoleDto dto);

    /**
     * 删除权限[逻辑]
     *
     * @param id
     * @return
     */
    Map<String, Object> deleteById(Integer id);

    /**
     * 根据角色删除权限[逻辑]
     *
     * @param roleId
     * @return
     */
    Map<String, Object> deleteByRoleId(Integer roleId);

    /**
     * 查询单个权限
     *
     * @param id
     * @return
     */
    Map<String, Object> getById(Integer id);

    /**
     * 根据角色查询权限
     *
     * @param id
     * @return
     */
    Map<String, Object> getByRoleId(Integer roleId);


    /**
     * 分页查询角色权限
     *
     * @return
     */
    Map<String, Object> listByCriteria(ListRolePsDto dto);
}
