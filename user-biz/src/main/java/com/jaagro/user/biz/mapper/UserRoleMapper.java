package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.UserRole;

public interface UserRoleMapper {
    /**
     *
     * @mbggenerated 2019-03-19
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insert(UserRole record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insertSelective(UserRole record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int updateByPrimaryKey(UserRole record);
}