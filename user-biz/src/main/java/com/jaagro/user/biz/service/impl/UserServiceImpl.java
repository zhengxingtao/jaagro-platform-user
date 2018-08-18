package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.constant.UserType;
import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.mapper.CustomerUserMapper;
import com.jaagro.user.biz.mapper.DriverMapper;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tony
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private CustomerUserMapper customerUserMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DriverMapper driverMapper;

    /**
     * 通过username获取user
     *
     * @param loginName
     * @return
     */
    @Override
    public UserInfo getByName(String loginName, String userType) {
        String userTypeTrim = userType.replaceAll(" ", "");

        if(UserType.CUSTOMER.equals(userTypeTrim)){
            UserInfo userInfo = customerUserMapper.getByULoginName(loginName);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("登录名为： " + loginName + " 的客户不存在");
            }
            return userInfo;
        }
        if(UserType.EMPLOYEE.equals(userTypeTrim)){
            UserInfo userInfo = employeeMapper.getByLoginName(loginName);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("登录名为： " + loginName + " 的员工不存在");
            }
            return userInfo;
        }
        if(UserType.DRIVER.equals(userTypeTrim)){
            UserInfo userInfo = driverMapper.getByLoginName(loginName);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("登录名为： " + loginName + " 的司机不存在");
            }
            return userInfo;
        }
        return null;
    }

    /**
     * 通过phone获取user
     *
     * @param phoneNumber
     * @return
     */
    @Override
    public UserInfo getByPhone(String phoneNumber, String userType) {
        String userTypeTrim = userType.replaceAll(" ", "");

        if(UserType.CUSTOMER.equals(userTypeTrim)){
            UserInfo userInfo = customerUserMapper.getByPhoneNumber(phoneNumber);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("手机号为： " + phoneNumber + " 的客户未注册");
            }
            return userInfo;
        }
        if(UserType.EMPLOYEE.equals(userTypeTrim)){
            UserInfo userInfo = employeeMapper.getByPhoneNumber(phoneNumber);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("手机号为： " + phoneNumber + " 的员工不存在");
            }
            return userInfo;
        }
        if(UserType.DRIVER.equals(userTypeTrim)){
            UserInfo userInfo = driverMapper.getByPhoneNumber(phoneNumber);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("手机号为： " + phoneNumber + " 的司机不存在");
            }
            return userInfo;
        }
        return null;
    }

    /**
     * 通过id获取user
     *
     * @param id
     * @return
     */
    @Override
    public UserInfo getById(Long id, String userType) {
        String userTypeTrim = userType.replaceAll(" ", "");

        if(UserType.CUSTOMER.equals(userTypeTrim)){
            UserInfo userInfo = customerUserMapper.getUserInfoById(id);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("客户Id为： " + id + " 的客户未注册");
            }
            return userInfo;
        }
        if(UserType.EMPLOYEE.equals(userTypeTrim)){
            UserInfo userInfo = employeeMapper.getUserInfoById(id);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("员工Id为： " + id + " 的员工不存在");
            }
            return userInfo;
        }
        if(UserType.DRIVER.equals(userTypeTrim)){
            UserInfo userInfo = driverMapper.getUserInfoById(id);
            if(userInfo == null){
                userInfo = new UserInfo()
                        .setId(-9999L)
                        .setUsername("司机Id为： " + id + " 的司机不存在");
            }
            return userInfo;
        }
        return null;
    }
}
