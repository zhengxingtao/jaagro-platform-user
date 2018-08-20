package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateTruckDto;

import java.util.Map;

/**
 * @author liqiangping
 */
public interface TruckService {

    /**
     * 新增车队
     * @param dto
     * @return
     */
    Map<String,Object> createTruck(CreateTruckDto dto);
}
