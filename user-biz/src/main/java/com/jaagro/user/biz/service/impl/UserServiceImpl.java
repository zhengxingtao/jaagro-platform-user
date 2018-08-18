package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tony
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过username获取user
     *
     * @param username
     * @return
     */
    @Override
    public UserInfo getByName(String username, String userType) {
        UserInfo user = userMapper.getByUsername(username);
        if(user == null){
            UserInfo userInfo = new UserInfo();
            userInfo.setId(-9999L).setUsername("用户名为： " + username + " 的用户不存在");
            return userInfo;
        }
        return user;
    }

    /**
     * 通过phone获取user
     *
     * @param phoneNumber
     * @return
     */
    @Override
    public UserInfo getByPhone(String phoneNumber, String userType) {
        UserInfo user = userMapper.getByPhone(phoneNumber);
        if(user == null){
            UserInfo userInfo = new UserInfo();
            userInfo.setId(-9999L).setUsername("手机号码： " + phoneNumber + "还未注册");
            return userInfo;
        }
        return user;
    }

    /**
     * 通过id获取user
     *
     * @param id
     * @return
     */
    @Override
    public UserInfo getById(Long id, String userType) {
        UserInfo user = userMapper.getById(id);
        if(user == null){
            UserInfo userInfo = new UserInfo();
            userInfo.setId(-9999L).setUsername("用户id： " + id + " 不存在");
            return userInfo;
        }
        return user;
    }
}
