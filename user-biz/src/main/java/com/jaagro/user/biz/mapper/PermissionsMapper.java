package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Permissions;

public interface PermissionsMapper {
    /**
     *
     * @mbggenerated 2019-03-14
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int insert(Permissions record);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int insertSelective(Permissions record);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    Permissions selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int updateByPrimaryKeySelective(Permissions record);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int updateByPrimaryKey(Permissions record);
}