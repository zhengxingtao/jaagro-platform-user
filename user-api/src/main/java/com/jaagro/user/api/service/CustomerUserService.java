package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.response.GetCustomerUserDto;

/**
 * @author tony
 */
public interface CustomerUserService {

    /**
     * 根据id获取customerUser
     * @param id
     * @return
     */
    GetCustomerUserDto getCustomerUserById(Integer id);
}
