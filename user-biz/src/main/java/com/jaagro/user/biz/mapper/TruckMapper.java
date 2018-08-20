package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Truck;

public interface TruckMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(Truck record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(Truck record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    Truck selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(Truck record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(Truck record);
}