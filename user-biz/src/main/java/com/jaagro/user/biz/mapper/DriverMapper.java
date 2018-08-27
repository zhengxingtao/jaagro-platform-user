package com.jaagro.user.biz.mapper;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.dto.response.DriverReturnDto;
import com.jaagro.user.biz.entity.Driver;

import java.util.List;

public interface DriverMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(Driver record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(Driver record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    Driver selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(Driver record);

    /**
     *
     * @mbggenerated 2018-08-22
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
    UserInfo getUserInfoById(Integer id);

    /**
     * 通过车辆id获取司机list
     * @param truckId
     * @return
     */
    List<DriverReturnDto> listDriverByTruckId(Integer truckId);
}