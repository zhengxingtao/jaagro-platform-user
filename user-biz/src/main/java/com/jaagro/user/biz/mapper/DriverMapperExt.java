package com.jaagro.user.biz.mapper;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.dto.response.DriverReturnDto;
import com.jaagro.user.biz.entity.Driver;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tony
 */
public interface DriverMapperExt extends DriverMapper {

    /**
     * 通过登录名获取司机
     *
     * @param loginName
     * @return
     */
    UserInfo getByLoginName(String loginName);

    /**
     * 通过手机号获取司机
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

    /**
     * 通过车辆id获取司机list
     *
     * @param truckId
     * @return
     */
    List<DriverReturnDto> listDriverByTruckId(Integer truckId);

    /**
     * 删除司机【逻辑】
     *
     * @param id
     * @param status
     * @return
     */
    Integer deleteDriverLogic(@Param("status") Integer status, @Param("id") Integer id);

    /**
     * 删除车队下所有司机【逻辑】
     *
     * @param status
     * @param truckId
     * @return
     */
    Integer deleteDriverByTruckId(@Param("status") Integer status, @Param("teamId") Integer truckId);

    /**
     * 通过id获取司机
     *
     * @param id
     * @return
     */
    DriverReturnDto getDriverById(Integer id);

    /**
     * app登陆时更新司机的注册id gavin
     * @param phoneNumber
     * @return
     */
    Integer updateDriverRegIdByPhoneNumber(@Param("phoneNumber") String phoneNumber,@Param("registrationId") String registrationId);
}