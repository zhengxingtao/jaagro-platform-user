package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.dto.request.ListDriverCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDriverDto;
import com.jaagro.user.api.dto.response.DriverReturnDto;
import com.oracle.tools.packager.mac.MacAppBundler;

import java.util.List;
import java.util.Map;

/**
 * @author liqiangping
 */
public interface DriverService {

    /**
     * 新增司机
     * @param driver
     * @return
     */
    Map<String,Object> createDriver(CreateDriverDto driver);

    /**
     * 提供给feign
     * @param driver
     * @return
     */
    Integer createDriverToFeign(CreateDriverDto driver);

    /**
     * 修改司机
     * @param driver
     * @return
     */
    Map<String, Object> updateDriver(UpdateDriverDto driver);

    /**
     * 获取单个司机
     * @param id
     * @return
     */
    Map<String, Object> getById(Integer id);

    /**
     * 通过条件获取所有司机（分页）
     * @param criteria
     * @return
     */
    Map<String, Object> listByCriteria(ListDriverCriteriaDto criteria);

    /**
     * 删除司机
     * @param id
     * @param notes
     * @return
     */
    Map<String, Object> disableDriver(Integer id, String notes);

    /**
     * 通过车辆获取司机
     * @param truckId
     * @return
     */
    List<DriverReturnDto> listByTruckId(Integer truckId);

}
