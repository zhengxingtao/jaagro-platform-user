package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.BusinessSupport;

public interface BusinessSupportMapper {
    /**
     *
     * @mbggenerated 2018-08-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int insert(BusinessSupport record);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int insertSelective(BusinessSupport record);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    BusinessSupport selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int updateByPrimaryKeySelective(BusinessSupport record);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int updateByPrimaryKey(BusinessSupport record);
}