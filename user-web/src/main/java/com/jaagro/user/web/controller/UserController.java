package com.jaagro.user.web.controller;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author tony
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 提供给feign调用
     *
     * @param key
     * @param userType
     * @param loginType
     * @return
     */
    @GetMapping("/getUserInfo")
    public UserInfo getUserInfo(@RequestParam("key") Object key, @RequestParam("userType") String userType, @RequestParam("loginType") String loginType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("loginType", loginType);
        map.put("key", key);
        map.put("userType", userType);
        return userService.getUserInfo(map);
    }
}
