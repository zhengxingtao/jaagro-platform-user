package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.RolePermission;

import java.util.List;

public interface RolePermissionMapper {
    /**
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbggenerated 2018-08-18
     */
    int insert(RolePermission record);

    /**
     * @mbggenerated 2018-08-18
     */
    int insertSelective(RolePermission record);

    /**
     * @mbggenerated 2018-08-18
     */
    RolePermission selectByPrimaryKey(Long id);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(RolePermission record);

    /**
     * 根据角色查询
     *
     * @param roleId
     * @return
     */
    List<RolePermission> listByRoleId(Long roleId);

    /**
     * 根据角色删除
     *
     * @param roleId
     * @return
     */
    int deleteByRoleId(Long roleId);

}