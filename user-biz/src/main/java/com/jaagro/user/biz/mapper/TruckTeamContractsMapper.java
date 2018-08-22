package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.TruckTeamContracts;

public interface TruckTeamContractsMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(TruckTeamContracts record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(TruckTeamContracts record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    TruckTeamContracts selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(TruckTeamContracts record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(TruckTeamContracts record);
}