package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateDriverDto;
import com.jaagro.user.api.dto.request.UpdateDriverDto;
import com.jaagro.user.api.dto.response.DriverReturnDto;
import com.jaagro.user.api.service.DriverService;
import com.jaagro.utils.BaseResponse;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author tony
 */
@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/driver")
    public BaseResponse createDriver(@RequestBody CreateDriverDto driver) {
        BaseResponse result;
        try {
            result = BaseResponse.service(driverService.createDriver(driver));
        } catch (Exception e) {
            throw e;
        }
        return result;
    }

    @GetMapping("/listDriverByTruckId/{truckId}")
    public List<DriverReturnDto> listByTruckId(@PathVariable("truckId") Integer truckId) {
        return driverService.listByTruckId(truckId);
    }

    @GetMapping("/driver/{id}")
    public BaseResponse getDriverById(@PathVariable("id") Integer id) {
        return BaseResponse.service(driverService.getById(id));
    }

    @Ignore
    @GetMapping("/driverFeign/{id}")
    public DriverReturnDto getDriverReturnObject(@PathVariable("id") Integer id) {
        return driverService.getDriverReturnObject(id);
    }

    @Ignore
    @PostMapping("/driverFeign")
    public Integer createDriverReturnId(@RequestBody CreateDriverDto driver) {
        Integer result;
        try {
            result = driverService.createDriverReturnId(driver);
        } catch (Exception e) {
            throw e;
        }
        return result;
    }

    @Ignore
    @PostMapping("/updateDriverFeign")
    public BaseResponse updateDriverFeign(@RequestBody UpdateDriverDto driver) {
        Map<String, Object> result;
        try {
            result = driverService.updateDriver(driver);
        } catch (Exception e) {
            throw e;
        }
        return BaseResponse.service(result);
    }

    @PostMapping("/driver/{id}")
    public BaseResponse deleteDriver(@PathVariable("id") Integer id) {

        return BaseResponse.service(driverService.deleteDriver(id));
    }

    @DeleteMapping("/driverByTruck/{truckId}")
    public BaseResponse deleteDriverByTruckId(@PathVariable("truckId") Integer truckId) {
        return BaseResponse.service(driverService.deleteDriverByTruckId(truckId));
    }

    @Ignore
    @PostMapping("/updateDriverStatusFeign/{driverId}")
    public BaseResponse updateDriverStatusFeign(@PathVariable("driverId") Integer driverId) {
        Map<String, Object> result;
        try {
            result = driverService.updateDriverStatus(driverId);
        } catch (Exception e) {
            throw e;
        }
        return BaseResponse.service(result);
    }

    @Ignore
    @PostMapping("/updateDriverByPhoneNumber")
    public BaseResponse updateDriverByPhoneNumber(@RequestBody UpdateDriverDto driver) {
        Map<String, Object> result;
        try {
            result = driverService.updateDriverRegIdByPhoneNumber(driver);
        } catch (Exception e) {
            throw e;
        }
        return BaseResponse.service(result);
    }
}
