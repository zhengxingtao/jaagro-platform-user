package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.TruckTeamBankcard;

public interface TruckTeamBankcardMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(TruckTeamBankcard record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(TruckTeamBankcard record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    TruckTeamBankcard selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(TruckTeamBankcard record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(TruckTeamBankcard record);
}