package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Employee;

public interface EmployeeMapper {
    /**
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int insert(Employee record);

    /**
     * @mbggenerated 2018-08-22
     */
    int insertSelective(Employee record);

    /**
     * @mbggenerated 2018-08-22
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(Employee record);
}