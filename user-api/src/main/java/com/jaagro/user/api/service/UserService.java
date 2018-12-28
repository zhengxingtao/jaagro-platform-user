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
     * 全局获取user
     * @param userId
     * @return
     */
    UserInfo getGlobalUser(int userId);

    /**
     * 批量获取全局user
     * @param userIds
     * @return
     */
    List<UserInfo> listGlobalUser(List<Integer> userIds);

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
