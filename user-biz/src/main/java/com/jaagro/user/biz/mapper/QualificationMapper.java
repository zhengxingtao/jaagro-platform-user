package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Qualification;

public interface QualificationMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(Qualification record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(Qualification record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    Qualification selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(Qualification record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(Qualification record);
}