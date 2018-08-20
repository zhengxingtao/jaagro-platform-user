package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.TruckQualificationCertific;

public interface TruckQualificationCertificMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(TruckQualificationCertific record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(TruckQualificationCertific record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    TruckQualificationCertific selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(TruckQualificationCertific record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(TruckQualificationCertific record);
}