package com.jaagro.user.biz.mapper;

import com.jaagro.constant.UserInfo;

/**
 * @author tony
 */
public interface CustomerUserMapperExt extends CustomerUserMapper {
    /**
     * 通过登录名获取userInfo
     *
     * @param loginName
     * @return
     */
    UserInfo getByLoginName(String loginName);

    /**
     * 通过手机号码获取userInfo
     *
     * @param phoneNumber
     * @return
     */
    UserInfo getByPhoneNumber(String phoneNumber);

    /**
     * id获取userInfo
     *
     * @param id
     * @return
     */
    UserInfo getUserInfoById(Integer id);
}