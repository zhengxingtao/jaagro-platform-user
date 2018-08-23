package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateDriverDto;

import java.util.Map;

/**
 * @author liqiangping
 */
public interface DriverService {

    /**
     * 新增车队
     * @param dto
     * @return
     */
    Map<String,Object> createDriver(CreateDriverDto dto);

}
