package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.response.GetCustomerUserDto;
import com.jaagro.user.api.service.CustomerUserService;
import com.jaagro.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getCustomerUserByPhoneNumber")
    public BaseResponse<GetCustomerUserDto> getCustomerUserByPhoneNumber(@RequestParam("phoneNumber") String phoneNumber){
        GetCustomerUserDto getCustomerUserDto = customerUserService.getByPhoneNumber(phoneNumber);
        if (getCustomerUserDto != null){
            return BaseResponse.successInstance(getCustomerUserDto);
        }
        return BaseResponse.queryDataEmpty();
    }

    @GetMapping("/getCustomerUserByRelevanceId/{relevanceId}")
    public BaseResponse<GetCustomerUserDto> getCustomerUserByRelevanceId(@PathVariable("relevanceId") Integer relevanceId){
        GetCustomerUserDto getCustomerUserDto = customerUserService.getCustomerUserByRelevanceId(relevanceId);
        if (getCustomerUserDto != null){
            return BaseResponse.successInstance(getCustomerUserDto);
        }
        return BaseResponse.idError();
    }
}
