package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getByUsername")
    public UserInfo getByName(@RequestParam String username, @RequestParam("userType") String userType){
        return userService.getByName(username, userType);
    }
    @GetMapping("/getByPhoneNumber")
    public UserInfo getByPhone(@RequestParam String phoneNumber, @RequestParam("userType") String userType){
        return userService.getByPhone(phoneNumber, userType);
    }
    @GetMapping("/getById")
    public UserInfo getById(@RequestParam Long id, @RequestParam("userType") String userType){
        return userService.getById(id, userType);
    }
}
