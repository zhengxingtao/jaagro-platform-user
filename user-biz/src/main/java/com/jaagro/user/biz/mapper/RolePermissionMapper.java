package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.RolePermission;

public interface RolePermissionMapper {
    /**
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int insert(RolePermission record);

    /**
     * @mbggenerated 2018-08-22
     */
    int insertSelective(RolePermission record);

    /**
     * @mbggenerated 2018-08-22
     */
    RolePermission selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(RolePermission record);
}