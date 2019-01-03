package com.jaagro.user.web.controller;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.service.UserService;
import com.jaagro.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author tony
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 提供给feign调用
     *
     * @param key
     * @param userType
     * @param loginType
     * @return
     */
    @GetMapping("/getUserInfo")
    public UserInfo getUserInfo(@RequestParam("key") Object key, @RequestParam("userType") String userType, @RequestParam("loginType") String loginType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("loginType", loginType);
        map.put("key", key);
        map.put("userType", userType);
        return userService.getUserInfo(map);
    }

    @GetMapping("/listUserInfo")
    public List<UserInfo> listUserInfo(@RequestParam("userIdList") List<Integer> userIdList, @RequestParam("userType") String userType) {
        if (CollectionUtils.isEmpty(userIdList) || StringUtils.isEmpty(userType)) {
            return null;
        }
        return userService.listUserInfo(userIdList, userType);
    }

    @GetMapping("/getGlobalUser/{userId}")
    public BaseResponse<UserInfo> getGlobalUser(@PathVariable("userId") int userId) {
        return BaseResponse.successInstance(userService.getGlobalUser(userId));
    }

    @PostMapping("/listGlobalUser")
    public BaseResponse<List<UserInfo>> listGlobalUser(Integer[] userIds) {
        List<Integer> userIdList = new ArrayList<>(Arrays.asList(userIds));
        return BaseResponse.successInstance(userService.listGlobalUser(userIdList));
    }
}
