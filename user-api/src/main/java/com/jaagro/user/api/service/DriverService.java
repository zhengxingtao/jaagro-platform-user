package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.dto.request.ListDriverCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDriverDto;
import com.jaagro.user.api.dto.response.DriverReturnDto;

import java.util.List;
import java.util.Map;

/**
 * @author liqiangping
 */
public interface DriverService {

    /**
     * 新增司机
     *
     * @param driver
     * @return
     */
    Map<String, Object> createDriver(CreateDriverDto driver);

    /**
     * 提供给feign
     *
     * @param driver
     * @return
     */
    Integer createDriverReturnId(CreateDriverDto driver);

    /**
     * 修改司机
     *
     * @param driver
     * @return
     */
    Map<String, Object> updateDriver(UpdateDriverDto driver);

    /**
     * 获取单个司机
     *
     * @param id
     * @return
     */
    Map<String, Object> getById(Integer id);

    /**
     * 获取单个司机 返回为对象
     *
     * @param id
     * @return
     */
    DriverReturnDto getDriverReturnObject(Integer id);

    /**
     * 通过条件获取所有司机（分页）
     *
     * @param criteria
     * @return
     */
    Map<String, Object> listByCriteria(ListDriverCriteriaDto criteria);

    /**
     * 删除司机
     *
     * @param id
     * @return
     */
    Map<String, Object> deleteDriver(Integer id);

    /**
     * 删除车辆所属司机
     *
     * @param truckId
     * @return
     */
    Map<String, Object> deleteDriverByTruckId(Integer truckId);

    /**
     * 通过车辆获取司机
     *
     * @param truckId
     * @return
     */
    List<DriverReturnDto> listByTruckId(Integer truckId);

    /**
     * 修改司机状态为审核通过
     *
     * @param driverId
     * @return
     */
    Map<String, Object> updateDriverStatus(Integer driverId);

    /**
     * 修改司机app注册设备id
     *
     * @param driver
     * @return
     */
    Map<String, Object> updateDriverRegIdByPhoneNumber(UpdateDriverDto driver);

    /**
     * 查询近一个过期驾驶证
     * @param expiryDateType
     * @return
     */
    List<DriverReturnDto> listCertificateOverdueNotice(Integer expiryDateType);
}
