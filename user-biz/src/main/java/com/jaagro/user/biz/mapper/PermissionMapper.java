package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Permission;

public interface PermissionMapper {
    /**
     *
     * @mbggenerated 2019-01-24
     */
    int deleteByPrimaryKey(String permissionNumber);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int insert(Permission record);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int insertSelective(Permission record);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    Permission selectByPrimaryKey(String permissionNumber);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int updateByPrimaryKey(Permission record);
}