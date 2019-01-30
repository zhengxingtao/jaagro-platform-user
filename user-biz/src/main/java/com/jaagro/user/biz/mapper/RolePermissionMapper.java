package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.RolePermission;

public interface RolePermissionMapper {
    /**
     *
     * @mbggenerated 2019-01-24
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int insert(RolePermission record);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int insertSelective(RolePermission record);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    RolePermission selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     *
     * @mbggenerated 2019-01-24
     */
    int updateByPrimaryKey(RolePermission record);
}