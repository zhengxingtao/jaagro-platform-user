package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.response.UserDto;
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
    public UserDto getByName(String username) {
        UserDto user = userMapper.getByUsername(username);
        if(user == null){
            UserDto userDto = new UserDto();
            userDto.setId(-9999L).setUsername("用户名为： " + username + " 的用户不存在");
            return userDto;
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
    public UserDto getByPhone(String phoneNumber) {
        UserDto user = userMapper.getByPhone(phoneNumber);
        if(user == null){
            UserDto userDto = new UserDto();
            userDto.setId(-9999L).setUsername("手机号码： " + phoneNumber + "还未注册");
            return userDto;
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
    public UserDto getById(Long id) {
        UserDto user = userMapper.getById(id);
        if(user == null){
            UserDto userDto = new UserDto();
            userDto.setId(-9999L).setUsername("用户id： " + id + " 不存在");
            return userDto;
        }
        return user;
    }
}
