package com.jaagro.user.api.service;


import com.jaagro.constant.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * @author tony
 */
public interface UserService {

    /**
     * 全局获取userInfo
     *
     * @param map
     * @return
     */
    UserInfo getUserInfo(Map<String, Object> map);

    /**
     * 获取当前user
     *
     * @return
     */
    UserInfo getCurrentUser();

    /**
     * @author yj
     * 查询用户信息列表
     * @param userIdList
     * @param userType
     * @return
     */
    List<UserInfo> listUserInfo(List<Integer> userIdList, String userType);
}
