package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.dto.request.ListDriverCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDriverDto;
import com.jaagro.user.api.dto.response.DriverReturnDto;
import com.jaagro.user.api.service.DriverService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.entity.Driver;
import com.jaagro.user.biz.mapper.DriverMapper;
import com.jaagro.utils.ServiceResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author tony
 */
@Service
public class DriverServiceImpl implements DriverService {

    private static final Logger log = LoggerFactory.getLogger(DriverServiceImpl.class);

    @Autowired
    private DriverMapper driverMapper;
    @Autowired
    private UserService userService;

    /**
     * 新增司机
     *
     * @param driver
     * @return
     */
    @Override
    public Map<String, Object> createDriver(CreateDriverDto driver) {
        return ServiceResult.toResult(createDriverToFeign(driver));
    }

    /**
     * 提供给feign
     *
     * @param driver
     * @return
     */
    @Override
    public Integer createDriverToFeign(CreateDriverDto driver) {
        if(driverMapper.getByPhoneNumber(driver.getPhoneNumber()) != null){
            throw new RuntimeException(driver.getPhoneNumber() + ": 当前手机号已被注册");
        }
        Driver dataDriver = new Driver();
        BeanUtils.copyProperties(driver, dataDriver);
        dataDriver.setCreateUserId(userService.getCurrentUser().getId());
        driverMapper.insertSelective(dataDriver);
        return dataDriver.getId();
    }

    /**
     * 修改司机
     *
     * @param driver
     * @return
     */
    @Override
    public Map<String, Object> updateDriver(UpdateDriverDto driver) {
        return null;
    }

    /**
     * 获取单个司机
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getById(Integer id) {
        return null;
    }

    /**
     * 通过条件获取所有司机（分页）
     *
     * @param criteria
     * @return
     */
    @Override
    public Map<String, Object> listByCriteria(ListDriverCriteriaDto criteria) {
        return null;
    }

    /**
     * 删除司机
     *
     * @param id
     * @param notes
     * @return
     */
    @Override
    public Map<String, Object> disableDriver(Integer id, String notes) {
        return null;
    }

    /**
     * 通过车辆获取司机
     *
     * @param truckId
     * @return
     */
    @Override
    public List<DriverReturnDto> listByTruckId(Integer truckId) {
        return driverMapper.listDriverByTruckId(truckId);
    }
}
