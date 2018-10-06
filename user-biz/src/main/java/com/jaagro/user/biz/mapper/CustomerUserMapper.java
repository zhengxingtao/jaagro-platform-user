package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.CustomerUser;

public interface CustomerUserMapper {
    /**
     *
     * @mbggenerated 2018-08-23
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int insert(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int insertSelective(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    CustomerUser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int updateByPrimaryKeySelective(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-23
     */
    int updateByPrimaryKey(CustomerUser record);
}