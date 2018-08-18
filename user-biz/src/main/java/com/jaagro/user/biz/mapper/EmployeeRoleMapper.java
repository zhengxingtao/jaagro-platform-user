package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.EmployeeRole;

public interface EmployeeRoleMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(EmployeeRole record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(EmployeeRole record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    EmployeeRole selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(EmployeeRole record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(EmployeeRole record);
}