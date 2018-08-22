package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.VehicleType;

public interface VehicleTypeMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(VehicleType record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(VehicleType record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    VehicleType selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(VehicleType record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(VehicleType record);
}