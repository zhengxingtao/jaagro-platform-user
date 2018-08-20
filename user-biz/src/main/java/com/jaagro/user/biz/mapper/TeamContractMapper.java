package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.TeamContract;

public interface TeamContractMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(TeamContract record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(TeamContract record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    TeamContract selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(TeamContract record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(TeamContract record);
}