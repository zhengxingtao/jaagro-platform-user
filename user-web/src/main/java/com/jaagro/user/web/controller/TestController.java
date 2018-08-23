package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony
 */
@RestController
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public UserInfo test(){
        return userService.getCurrentUser();
    }
}
