package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Role;

import java.util.List;

/**
 * @author baiyiran
 */
public interface RoleMapper {
    /**
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbggenerated 2018-08-18
     */
    int insert(Role record);

    /**
     * @mbggenerated 2018-08-18
     */
    int insertSelective(Role record);

    /**
     * @mbggenerated 2018-08-18
     */
    Role selectByPrimaryKey(Long id);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(Role record);

    /**
     * 查询全部角色
     *
     * @return
     */
    List<Role> listAll();

    /**
     * 单个查询角色[含角色权限]
     *
     * @param id
     * @return
     */
    /* ReturnRoleDto getById(Long id);*/
}