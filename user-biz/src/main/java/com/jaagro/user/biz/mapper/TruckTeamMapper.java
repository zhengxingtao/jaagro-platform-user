package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.TruckTeamReturnDto;
import com.jaagro.user.biz.entity.TruckTeam;

import java.util.List;

public interface TruckTeamMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(TruckTeam record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(TruckTeam record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    TruckTeam selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(TruckTeam record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(TruckTeam record);

    /**
     * 查询单个车队
     */
    List<TruckTeamReturnDto> getByVehicleId(Long vehicle_id);
}