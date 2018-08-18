package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.biz.entity.Driver;

public interface DriverMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(Driver record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(Driver record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    Driver selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(Driver record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(Driver record);

    /**
     * 通过登录名获取司机
     * @param loginName
     * @return
     */
    UserInfo getByLoginName(String loginName);

    /**
     * 通过手机号获取司机
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