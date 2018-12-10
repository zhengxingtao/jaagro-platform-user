package com.jaagro.user.web.controller;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.dto.response.DepartmentReturnDto;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.config.UserIdGeneratorFactory;
import com.jaagro.user.biz.mapper.DepartmentMapperExt;
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
    @Autowired
    DepartmentMapperExt departmentMapper;

    @GetMapping("/test")
    public UserInfo test(){
        return userService.getCurrentUser();
    }

    @GetMapping("/test2")
    public DepartmentReturnDto test2(){
        return departmentMapper.getById(1);
    }

    @Autowired
    UserIdGeneratorFactory userIdGeneratorFactory;

    @GetMapping("/test3")
    public int test3(){
        return userIdGeneratorFactory.getNextId();
    }
}
