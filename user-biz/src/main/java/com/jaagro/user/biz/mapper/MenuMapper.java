package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Menu;

public interface MenuMapper {
    /**
     *
     * @mbggenerated 2019-03-14
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int insert(Menu record);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int insertSelective(Menu record);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    Menu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     *
     * @mbggenerated 2019-03-14
     */
    int updateByPrimaryKey(Menu record);
}