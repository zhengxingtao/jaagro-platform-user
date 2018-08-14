package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.UserDto;

/**
 * @author tony
 */
public interface UserService {

    /**
     * 通过username获取user
     * @param username
     * @return
     */
    UserDto getByName(String username);

    /**
     * 通过phone获取user
     * @param phoneNumber
     * @return
     */
    UserDto getByPhone(String phoneNumber);

    /**
     * 通过id获取user
     * @param id
     * @return
     */
    UserDto getById(Long id);
}
