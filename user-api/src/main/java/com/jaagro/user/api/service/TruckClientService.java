package com.jaagro.user.api.service;

import com.jaagro.utils.BaseResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author tony
 */
@FeignClient("crm")
public interface TruckClientService {

    /**
     * 获取车辆
     * @param id
     * @return
     */
    @GetMapping("/truck/{id}")
    BaseResponse getTruckById(@PathVariable("id") Integer id);

    /**
     * 获取车队
     * @param id
     * @return
     */
    @GetMapping("/truckTeam/{id}")
    BaseResponse getTruckTeamById(@PathVariable("id") Integer id);
}
