package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.dto.response.ReturnPermissionDto;
import com.jaagro.user.api.dto.response.RoleReturnDto;

import java.util.List;
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

    /**
     * 分页查询角色
     *
     * @return
     */
    Map<String, Object> listAllRole();

    /**
     * 依据userId获取用户role列表
     * @param userId
     * @return
     */
    List<RoleReturnDto> listRoleByUserId(int userId);

    /**
     * 根据roleId获取permission列表
     * @param roleId
     * @return
     */
    @Deprecated
    List<ReturnPermissionDto> listPermissionByRoleId(Integer roleId);

}
