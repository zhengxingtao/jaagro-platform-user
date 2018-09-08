package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Permission;

import java.util.List;

public interface PermissionMapper {
    /**
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int insert(Permission record);

    /**
     * @mbggenerated 2018-08-22
     */
    int insertSelective(Permission record);

    /**
     * @mbggenerated 2018-08-22
     */
    Permission selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(Permission record);

    /**
     * 根据权限编号查询
     *
     * @param accessNumber
     * @return
     */
    List<Permission> getByNumber(String accessNumber);

    /**
     * 获取全部的权限
     *
     * @return
     */
    List<Permission> listAll();
}