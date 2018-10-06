package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.EmployeeRole;

import java.util.List;

public interface EmployeeRoleMapper {
    /**
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-18
     */
    int insert(EmployeeRole record);

    /**
     * @mbggenerated 2018-08-18
     */
    int insertSelective(EmployeeRole record);

    /**
     * @mbggenerated 2018-08-18
     */
    EmployeeRole selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(EmployeeRole record);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(EmployeeRole record);
}