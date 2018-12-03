package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.IdGenerator;

public interface IdGeneratorMapper {
    /**
     * @mbggenerated 2018-12-03
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-12-03
     */
    int insert(IdGenerator record);

    /**
     * @mbggenerated 2018-12-03
     */
    int insertSelective(IdGenerator record);

    /**
     * @mbggenerated 2018-12-03
     */
    IdGenerator selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-12-03
     */
    int updateByPrimaryKeySelective(IdGenerator record);

    /**
     * @mbggenerated 2018-12-03
     */
    int updateByPrimaryKey(IdGenerator record);
}