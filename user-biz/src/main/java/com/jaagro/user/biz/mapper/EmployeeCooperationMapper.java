package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.EmployeeCooperation;

/**
 * @author tony
 */
public interface EmployeeCooperationMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(EmployeeCooperation record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(EmployeeCooperation record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    EmployeeCooperation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(EmployeeCooperation record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(EmployeeCooperation record);
}