package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.CustomerUser;

public interface CustomerUserMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    CustomerUser selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(CustomerUser record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(CustomerUser record);
}