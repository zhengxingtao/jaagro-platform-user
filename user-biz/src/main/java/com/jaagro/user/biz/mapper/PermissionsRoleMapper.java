package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.PermissionsRole;

public interface PermissionsRoleMapper {
    /**
     *
     * @mbggenerated 2019-03-19
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insert(PermissionsRole record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insertSelective(PermissionsRole record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    PermissionsRole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int updateByPrimaryKeySelective(PermissionsRole record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int updateByPrimaryKey(PermissionsRole record);
}