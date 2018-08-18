package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Permission;

public interface PermissionMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(Permission record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(Permission record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    Permission selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(Permission record);
}