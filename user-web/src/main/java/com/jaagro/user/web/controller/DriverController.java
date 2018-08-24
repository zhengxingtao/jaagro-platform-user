package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.service.DriverService;
import com.jaagro.user.api.service.TruckClientService;
import com.jaagro.user.biz.mapper.DriverMapper;
import com.jaagro.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony
 */
@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;
    @Autowired
    private DriverMapper driverMapper;
    @Autowired
    private TruckClientService truckClientService;

    @PostMapping("/driver")
    public BaseResponse createDriver(@RequestBody CreateDriverDto driver){
        if(driverMapper.getByPhoneNumber(driver.getPhoneNumber()) != null){
            throw new RuntimeException(driver.getPhoneNumber() + ": 当前手机号已被注册");
        }
        if(truckClientService.getTruckById(driver.getTruckId()).getData() == null){
            throw new RuntimeException(driver.getTruckId() + ": 车辆不存在");
        }
        if(truckClientService.getTruckTeamById(driver.getTruckTeamId()).getData() == null){
            throw new RuntimeException(driver.getTruckTeamId() + ": 车队不存在");
        }
        return BaseResponse.service(driverService.createDriver(driver));
    }
}
