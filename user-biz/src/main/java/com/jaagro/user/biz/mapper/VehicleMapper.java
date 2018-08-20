package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Vehicle;

public interface VehicleMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(Vehicle record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(Vehicle record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    Vehicle selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(Vehicle record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(Vehicle record);
}