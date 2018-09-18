package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Permission;

import java.util.List;

/**
 * @author tony
 */
public interface PermissionMapperExt extends PermissionMapper {
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