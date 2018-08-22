package com.jaagro.user.web.controller;

import com.jaagro.user.api.service.TruckService;
import com.jaagro.user.biz.mapper.TruckMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import utils.BaseResponse;

/**
 * @author liqiangping
 */
@RestController
@Api(value = "truck", description = "车辆管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class TruckController {

    @Autowired
    private TruckService truckService;

    @Autowired
    private TruckMapper truckMapper;

    @ApiOperation("查询单个客户")
    @GetMapping("/vehicle/{id}")
    public BaseResponse getById(@PathVariable Integer id) {
        if(this.truckMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到车辆信息");
        }
        return BaseResponse.service(truckService.getById(id));
    }
}
