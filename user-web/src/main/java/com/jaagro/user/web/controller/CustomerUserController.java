package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.response.GetCustomerUserDto;
import com.jaagro.user.api.service.CustomerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony
 */
@RestController
public class CustomerUserController {

    @Autowired
    private CustomerUserService customerUserService;

    @GetMapping("/customerUser/{id}")
    public GetCustomerUserDto getCustomerUserById(@PathVariable("id") Integer id) {
        return customerUserService.getCustomerUserById(id);
    }
}
