package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateTruckTeamDto;
import com.jaagro.user.api.service.TruckTeamService;
import com.jaagro.user.biz.mapper.TruckMapper;
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
@Api(value = "truck", description = "车队管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class TruckTeamController {

    @Autowired
    private TruckTeamService truckService;
    @Autowired
    private TruckMapper truckMapper;

    @ApiOperation("新增车队")
    @PostMapping("/truck")
    public BaseResponse insert(@RequestBody CreateTruckTeamDto dto){
        if(StringUtils.isEmpty(dto.getTeamName())){
            return BaseResponse.errorInstance("车队名称不能为空");
        }
        if(StringUtils.isEmpty(dto.getCreditCode())){
            return BaseResponse.errorInstance("身份证不能为空");
        }
        return BaseResponse.service(truckService.createTruck(dto));
    }
}
