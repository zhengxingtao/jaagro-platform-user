package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.response.UserDto;

/**
 * @author tony
 */
public interface UserService {

    /**
     * 通过username获取user
     * @param userType
     * @param username
     * @return
     */
    UserDto getByName(String username, String userType);

    /**
     * 通过phone获取user
     * @param phoneNumber
     * @param userType
     * @return
     */
    UserDto getByPhone(String phoneNumber, String userType);

    /**
     * 通过id获取user
     * @param id
     * @param userType
     * @return
     */
    UserDto getById(Long id, String userType);
}
