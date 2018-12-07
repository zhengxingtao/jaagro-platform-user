package com.jaagro.user.web.controller;

import com.jaagro.user.biz.config.UserIdGeneratorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony
 */
@RestController
public class UserIdFactoryController {

    @Autowired
    private UserIdGeneratorFactory userIdGeneratorFactory;

    @GetMapping("/getNextUserId")
    public int getNextUserId(){
        return userIdGeneratorFactory.getNextId();
    }
}
