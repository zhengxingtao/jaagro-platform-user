package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.TruckTeamContract;

public interface TruckTeamContractMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(TruckTeamContract record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(TruckTeamContract record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    TruckTeamContract selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(TruckTeamContract record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(TruckTeamContract record);
}