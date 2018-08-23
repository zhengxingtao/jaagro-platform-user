package com.jaagro.user.biz.service.impl;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.constant.UserType;
import com.jaagro.user.api.service.UserClientService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.mapper.CustomerUserMapper;
import com.jaagro.user.biz.mapper.DriverMapper;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author tony
 */
@Service
public class UserServiceImpl implements UserService {

    private static final String KEY = "key";
    private static final String LOGIN_TYPE = "loginType";

    private static final String LOGIN_NAME = "loginName";
    private static final String PHONE_NUMBER = "phoneNumber";
    private static final String ID = "id";

    private static final String USER_TYPE = "userType";

    @Autowired
    private CustomerUserMapper customerUserMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DriverMapper driverMapper;
    @Autowired
    private UserClientService userClientService;
    @Autowired
    private HttpServletRequest request;

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserInfo getUserInfo(Map<String, Object> map){
        String userTypeTrim = map.get(USER_TYPE).toString().replaceAll(" ", "");
        String loginType = (String) map.get(LOGIN_TYPE);
        UserInfo userInfo = null;
        if(UserType.CUSTOMER.equals(userTypeTrim)){
            if(LOGIN_NAME.equals(loginType)){
                String key = (String) map.get(KEY);
                userInfo = customerUserMapper.getByULoginName(key);
            }
            if(PHONE_NUMBER.equals(loginType)){
                String key = (String) map.get(KEY);
                userInfo = customerUserMapper.getByPhoneNumber(key);
            }
            if(ID.equals(loginType)){
                Integer key = (Integer) map.get(KEY);
                userInfo = customerUserMapper.getUserInfoById(key);
            }
        }
        if(UserType.EMPLOYEE.equals(userTypeTrim)){
            if(LOGIN_NAME.equals(loginType)){
                String key = (String) map.get(KEY);
                userInfo = employeeMapper.getByLoginName(key);
            }
            if(PHONE_NUMBER.equals(loginType)){
                String key = (String) map.get(KEY);
                userInfo = employeeMapper.getByPhoneNumber(key);
            }
            if(ID.equals(loginType)){
                Integer key = (Integer) map.get(KEY);
                userInfo = employeeMapper.getUserInfoById(key);
            }
        }
        if(UserType.DRIVER.equals(userTypeTrim)){
            if(LOGIN_NAME.equals(loginType)){
                String key = (String) map.get(KEY);
                userInfo = driverMapper.getByLoginName(key);
            }
            if(PHONE_NUMBER.equals(loginType)){
                String key = (String) map.get(KEY);
                userInfo = driverMapper.getByPhoneNumber(key);
            }
            if(ID.equals(loginType)){
                Integer key = (Integer) map.get(KEY);
                userInfo = driverMapper.getUserInfoById(key);
            }
        }

        if(userInfo != null){
            userInfo.setUserType(userTypeTrim);
            log.debug(String.valueOf(userInfo));
            return userInfo;
        }

        return null;
    }

    @Override
    public UserInfo getCurrentUser(){
        String token = request.getHeader("token");
        System.out.println(token);
        return userClientService.getUserByToken(token);
    }
}
