package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.ReturnPermissionDto;
import com.jaagro.user.biz.entity.RolePermission;

import java.util.List;

public interface RolePermissionMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(RolePermission record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(RolePermission record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    RolePermission selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(RolePermission record);

    /**
     * 根据角色查询
     *
     * @param roleId
     * @return
     */
    List<ReturnPermissionDto> listByRoleId(Integer roleId);

    /**
     * 根据角色删除
     *
     * @param roleId
     * @return
     */
    int deleteByRoleId(Integer roleId);

}