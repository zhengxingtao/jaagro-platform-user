package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.service.DriverService;
import com.jaagro.user.biz.mapper.DriverMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import utils.BaseResponse;

/**
 * @author liqiangping
 */
@RestController
@Api(value = "truck", description = "司机管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverController {
    @Autowired
    private DriverService driverService;
    @Autowired
    private DriverMapper driverMapper;

    @ApiOperation("新增车队")
    @PostMapping("/driver")
    public BaseResponse insert(@RequestBody CreateDriverDto dto){
        if(StringUtils.isEmpty(dto.getDriverName())){
            return BaseResponse.errorInstance("司机名称不能为空");
        }
        return BaseResponse.service(driverService.createDriver(dto));
    }

}
