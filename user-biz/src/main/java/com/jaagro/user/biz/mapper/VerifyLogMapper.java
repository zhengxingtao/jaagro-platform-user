package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.VerifyLog;

public interface VerifyLogMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(VerifyLog record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(VerifyLog record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    VerifyLog selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(VerifyLog record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(VerifyLog record);
}