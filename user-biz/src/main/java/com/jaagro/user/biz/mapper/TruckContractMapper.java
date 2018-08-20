package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.TruckContract;

public interface TruckContractMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(TruckContract record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(TruckContract record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    TruckContract selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(TruckContract record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(TruckContract record);
}