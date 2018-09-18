package com.jaagro.user.biz.service.impl;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.constant.UserType;
import com.jaagro.user.api.service.UserClientService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.mapper.*;
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
    private CustomerUserMapperExt customerUserMapper;
    @Autowired
    private EmployeeMapperExt employeeMapper;
    @Autowired
    private DriverMapperExt driverMapper;
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
                userInfo = customerUserMapper.getByLoginName(parseKey(map));
            }
            if(PHONE_NUMBER.equals(loginType)){
                userInfo = customerUserMapper.getByPhoneNumber(parseKey(map));
            }
            if(ID.equals(loginType)){
                userInfo = customerUserMapper.getUserInfoById(parseKey(map));
            }
        }
        if(UserType.EMPLOYEE.equals(userTypeTrim)){
            if(LOGIN_NAME.equals(loginType)){
                userInfo = employeeMapper.getByLoginName(parseKey(map));
            }
            if(PHONE_NUMBER.equals(loginType)){
                userInfo = employeeMapper.getByPhone(parseKey(map));
            }
            if(ID.equals(loginType)){
                userInfo = employeeMapper.getUserInfoById(parseKey(map));
            }
        }
        if(UserType.DRIVER.equals(userTypeTrim)){
            if(LOGIN_NAME.equals(loginType)){
                userInfo = driverMapper.getByLoginName(parseKey(map));
            }
            if(PHONE_NUMBER.equals(loginType)){
                userInfo = driverMapper.getByPhoneNumber(parseKey(map));
            }
            if(ID.equals(loginType)){
                userInfo = driverMapper.getUserInfoById(parseKey(map));
            }
        }

        if(userInfo != null){
            userInfo.setUserType(userTypeTrim);
            log.debug(String.valueOf(userInfo));
            return userInfo;
        }

        return null;
    }

    private <T> T parseKey(Map<String, Object> map){
        if(ID.equals(map.get(LOGIN_TYPE).toString())) {
             return (T) new Integer(map.get(KEY).toString());
        }else {
            return (T) map.get(KEY).toString();
        }
    }

    @Override
    public UserInfo getCurrentUser(){
        String token = request.getHeader("token");
        return userClientService.getUserByToken(token);
    }
}
