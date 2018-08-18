package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.biz.entity.User;

/**
 * @author tony
 */
public interface UserMapper {

    /**
     * 删除单条
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 动态sql新增
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 通过id查询单条user
     * @param id
     * @return
     */
    User selectByPrimaryKey(Long id);

    /**
     * 动态sql更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新全部字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    /**
     * 通过用户名获取user
     * @param username
     * @return
     */
    UserInfo getByUsername(String username);

    /**
     * 通过phone获取user
     * @param phoneNumber
     * @return
     */
    UserInfo getByPhone(String phoneNumber);

    /**
     * 通过userId获取UserDto
     * @param id
     * @return
     */
    UserInfo getById(Long id);
}