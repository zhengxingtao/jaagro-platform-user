package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.ReturnPermissionDto;
import com.jaagro.user.biz.entity.RolePermission;

import java.util.List;

/**
 * @author tony
 */
public interface RolePermissionMapperExt extends RolePermissionMapper {

    /**
     * 根据角色查询
     *
     * @param roleId
     * @return
     */
    List<ReturnPermissionDto> listByRoleId(Integer roleId);

    /**
     * 根据角色逻辑删除
     *
     * @param roleId
     * @return
     */
    int disableByRoleId(Integer roleId);

    /**
     * 根据角色删除
     *
     * @param roleId
     * @return
     */
    int deleteByRoleId(Integer roleId);
}