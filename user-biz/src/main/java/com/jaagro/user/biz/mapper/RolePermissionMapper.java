package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.RolePermission;

public interface RolePermissionMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(RolePermission record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(RolePermission record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    RolePermission selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(RolePermission record);
}