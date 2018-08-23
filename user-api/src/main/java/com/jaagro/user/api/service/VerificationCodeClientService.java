package com.jaagro.user.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tony
 */
@FeignClient(value = "component")
public interface VerificationCodeClientService {

    /**
     * 短信验证码是否有效
     * @param phoneNumber
     * @param verificationCode
     * @return
     */
    @PostMapping("/existMessage")
    boolean existMessage(@RequestParam("phoneNumber") String phoneNumber,
                         @RequestParam("verificationCode") String verificationCode);
}
