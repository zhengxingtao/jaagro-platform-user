package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.VerifyLog;

public interface VerifyLogMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(VerifyLog record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(VerifyLog record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    VerifyLog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(VerifyLog record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(VerifyLog record);
}