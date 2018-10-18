package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.constant.AuditStatus;
import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.dto.request.ListDriverCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDriverDto;
import com.jaagro.user.api.dto.response.DriverReturnDto;
import com.jaagro.user.api.service.DriverService;
import com.jaagro.user.api.service.TruckClientService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.entity.Driver;
import com.jaagro.user.biz.mapper.DriverMapper;
import com.jaagro.user.biz.mapper.DriverMapperExt;
import com.jaagro.utils.ResponseStatusCode;
import com.jaagro.utils.ServiceResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author tony
 */
@Service
public class DriverServiceImpl implements DriverService {

    private static final Logger log = LoggerFactory.getLogger(DriverServiceImpl.class);

    @Autowired
    private DriverMapperExt driverMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private TruckClientService truckClientService;

    /**
     * 新增司机
     *
     * @param driver
     * @return
     */
    @Override
    public Map<String, Object> createDriver(CreateDriverDto driver) {
        return ServiceResult.toResult(createDriverReturnId(driver));
    }

    /**
     * 提供给feign
     *
     * @param driver
     * @return
     */
    @Override
    public Integer createDriverReturnId(CreateDriverDto driver) {
        if (driverMapper.getByPhoneNumber(driver.getPhoneNumber()) != null) {
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
        System.err.println("-----------司机:" + driver.toString());
        if (driver.getId() == null) {
            throw new NullPointerException("司机id不能为空");
        }
        Driver dataDriver = new Driver();
        BeanUtils.copyProperties(driver, dataDriver);
        dataDriver
                .setModifyUserId(this.userService.getCurrentUser().getId())
                .setModifyTime(new Date());
        this.driverMapper.updateByPrimaryKeySelective(dataDriver);
        return ServiceResult.toResult("修改成功");
    }

    /**
     * 获取单个司机
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getById(Integer id) {
        DriverReturnDto driver = driverMapper.getDriverById(id);
        if (driver == null) {
            ServiceResult.error(ResponseStatusCode.QUERY_DATA_ERROR.getCode(), id + " :不存在");
        }
        return ServiceResult.toResult(driver);
    }

    /**
     * 获取单个司机 返回为对象
     *
     * @param id
     * @return
     */
    @Override
    public DriverReturnDto getDriverReturnObject(Integer id) {
        return driverMapper.getDriverById(id);
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
     * @return
     */
    @Override
    public Map<String, Object> deleteDriver(Integer id) {
        if (driverMapper.selectByPrimaryKey(id) == null) {
            throw new NullPointerException(id + " :不正确");
        }
        //后期扩展如果当前driver有任务未完成，无法删除
        driverMapper.deleteDriverLogic(AuditStatus.STOP_COOPERATION, id);
        //逻辑删除司机相关资质
        this.truckClientService.deleteTruckQualificationByDriverId(id);
        return ServiceResult.toResult(id + " :删除成功");
    }

    /**
     * 删除车队所有司机
     *
     * @param teamId
     * @return
     */
    @Override
    public Map<String, Object> deleteDriverByTruckId(Integer teamId) {
        //后期扩展如果当前driver有任务未完成，无法删除
        driverMapper.deleteDriverByTruckId(AuditStatus.STOP_COOPERATION, teamId);
        //逻辑删除司机相关资质
        List<DriverReturnDto> driverReturnDtos = listByTruckId(teamId);
        if (driverReturnDtos.size() > 0) {
            for (DriverReturnDto driverReturnDto : driverReturnDtos
            ) {
                this.truckClientService.deleteTruckQualificationByDriverId(driverReturnDto.getId());
            }
        }
        return ServiceResult.toResult("车辆id为" + teamId + " :的记录删除成功");
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

    @Override
    public Map<String, Object> updateDriverStatus(Integer driverId) {
        Driver driver = driverMapper.selectByPrimaryKey(driverId);
        if (driver != null) {
            driver
                    .setStatus(AuditStatus.NORMAL_COOPERATION)
                    .setModifyTime(new Date())
                    .setModifyUserId(userService.getCurrentUser().getId());
            driverMapper.updateByPrimaryKeySelective(driver);
            return ServiceResult.toResult("审核司机通过成功");
        }
        return ServiceResult.error(ResponseStatusCode.QUERY_DATA_ERROR.getCode(), "司机不存在");
    }
}
