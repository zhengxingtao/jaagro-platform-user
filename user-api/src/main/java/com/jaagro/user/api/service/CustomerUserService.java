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

    /**
     * 根据手机号查询
     * @param phoneNumber
     * @return
     */
    GetCustomerUserDto getByPhoneNumber(String phoneNumber);

    /**
     * 根据关联客户id查询
     * @param relevanceId
     * @return
     */
    GetCustomerUserDto getCustomerUserByRelevanceId(Integer relevanceId);
}
