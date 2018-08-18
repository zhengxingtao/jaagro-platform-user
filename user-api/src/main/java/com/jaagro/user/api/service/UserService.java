package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.response.UserInfo;

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
    UserInfo getByName(String username, String userType);

    /**
     * 通过phone获取user
     * @param phoneNumber
     * @param userType
     * @return
     */
    UserInfo getByPhone(String phoneNumber, String userType);

    /**
     * 通过id获取user
     * @param id
     * @param userType
     * @return
     */
    UserInfo getById(Long id, String userType);
}
