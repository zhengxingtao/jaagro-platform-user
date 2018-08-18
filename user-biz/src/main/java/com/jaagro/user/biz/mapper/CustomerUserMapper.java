package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.biz.entity.CustomerUser;

public interface CustomerUserMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    CustomerUser selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(CustomerUser record);

    /**
     * 通过登录名获取userInfo
     * @param loginName
     * @return
     */
    UserInfo getByULoginName(String loginName);

    /**
     * 通过手机号码获取userInfo
     * @param phoneNumber
     * @return
     */
    UserInfo getByPhoneNumber(String phoneNumber);

    /**
     * id获取userInfo
     * @param id
     * @return
     */
    UserInfo getUserInfoById(Long id);
}