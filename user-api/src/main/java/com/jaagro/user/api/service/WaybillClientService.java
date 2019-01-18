package com.jaagro.user.api.service;

import com.jaagro.utils.BaseResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author baiyiran
 * @Date 2019/1/9
 */
@FeignClient(value = "tms")
public interface WaybillClientService {

    /**
     * 根据司机id统计未完成的运单
     *
     * @param driverId
     * @return
     */
    @GetMapping("/countUnFinishWaybillByDriver/{driverId}")
    BaseResponse<Integer> countUnFinishWaybillByDriver(@PathVariable("driverId") Integer driverId);
}
