package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.EmployeeCooperation;

import java.util.List;

/**
 * @author tony
 */
public interface EmployeeCooperationMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(EmployeeCooperation record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(EmployeeCooperation record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    EmployeeCooperation selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(EmployeeCooperation record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(EmployeeCooperation record);

}