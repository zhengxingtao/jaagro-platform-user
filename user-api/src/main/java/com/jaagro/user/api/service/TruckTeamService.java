package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateTruckTeamDto;

import java.util.Map;

/**
 * @author liqiangping
 */
public interface TruckTeamService {

    /**
     * 新增车队
     * @param dto
     * @return
     */
    Map<String,Object> createTruck(CreateTruckTeamDto dto);
}
