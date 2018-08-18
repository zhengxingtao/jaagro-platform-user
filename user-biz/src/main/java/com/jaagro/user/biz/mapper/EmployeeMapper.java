package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.UserInfo;
import com.jaagro.user.biz.entity.Employee;

public interface EmployeeMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(Employee record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(Employee record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    Employee selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(Employee record);

    /**
     * 登录名获取员工
     * @param loginName
     * @return
     */
    UserInfo getByLoginName(String loginName);

    /**
     * 手机号获取员工
     * @param phoneNumber
     * @return
     */
    UserInfo getByPhoneNumber(String phoneNumber);

    /**
     * id获取userInfo
     * @param id
     * @return
     */
    UserInfo getUserInfoById(Long id);
}