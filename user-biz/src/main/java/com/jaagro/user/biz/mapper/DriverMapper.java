package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Driver;

public interface DriverMapper {
    /**
     *
     * @mbggenerated 2018-09-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int insert(Driver record);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int insertSelective(Driver record);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    Driver selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int updateByPrimaryKeySelective(Driver record);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int updateByPrimaryKey(Driver record);
}