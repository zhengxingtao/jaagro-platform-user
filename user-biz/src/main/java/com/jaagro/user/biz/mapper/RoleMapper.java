package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Role;

/**
 * @author baiyiran
 */
public interface RoleMapper {
    /**
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-18
     */
    int insert(Role record);

    /**
     * @mbggenerated 2018-08-18
     */
    int insertSelective(Role record);

    /**
     * @mbggenerated 2018-08-18
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(Role record);
}