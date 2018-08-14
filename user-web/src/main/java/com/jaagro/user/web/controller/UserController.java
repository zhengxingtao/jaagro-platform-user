package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.UserDto;
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
    public UserDto getByName(@RequestParam String username){
        return userService.getByName(username);
    }
    @GetMapping("/getByPhoneNumber")
    public UserDto getByPhone(@RequestParam String phoneNumber){
        return userService.getByPhone(phoneNumber);
    }

    @GetMapping("/getById")
    public UserDto getById(@RequestParam Long id){
        return userService.getById(id);
    }
}
