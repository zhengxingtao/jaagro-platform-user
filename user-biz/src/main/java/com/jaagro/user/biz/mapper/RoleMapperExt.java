package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.dto.response.ReturnRoleDto;
import com.jaagro.user.biz.entity.Role;

import java.util.List;

/**
 * @author baiyiran
 */
public interface RoleMapperExt extends RoleMapper {

    /**
     * 查询全部角色
     *
     * @return
     */
    List<Role> listAll();

    /**
     * 查询全部角色
     *
     * @return
     */
    List<Role> listByCriteria(ListRoleCriteriaDto roleCriteriaDto);

    /**
     * 根据名称查询
     *
     * @param roleDto
     * @return
     */
    Role getByName(UpdateRoleDto roleDto);

    /**
     * 单个查询角色[含角色权限]
     *
     * @param id
     * @return
     */
    ReturnRoleDto getRoleDetailById(Integer id);
}