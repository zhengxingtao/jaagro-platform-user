package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Driver;

public interface DriverMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(Driver record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(Driver record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    Driver selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(Driver record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(Driver record);
}