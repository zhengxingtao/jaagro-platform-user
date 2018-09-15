package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Department;

public interface DepartmentMapper {
    /**
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int insert(Department record);

    /**
     * @mbggenerated 2018-08-22
     */
    int insertSelective(Department record);

    /**
     * @mbggenerated 2018-08-22
     */
    Department selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(Department record);
}