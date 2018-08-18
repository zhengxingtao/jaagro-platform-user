package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Department;

public interface DepartmentMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(Department record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(Department record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    Department selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(Department record);
}