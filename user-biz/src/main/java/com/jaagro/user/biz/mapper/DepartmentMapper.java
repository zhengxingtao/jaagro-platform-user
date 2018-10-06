package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Department;

public interface DepartmentMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Department record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Department record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Department selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Department record);
}