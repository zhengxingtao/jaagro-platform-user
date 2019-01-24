package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.Permission;

import java.util.List;

/**
 * @author tony
 * @date 2019-01-24
 */
public interface PermissionMapperExt extends PermissionMapper {
    /**
     * 根据权限编号查询
     *
     * @param accessNumber
     * @return
     */
    List<Permission> getByNumber(String permissionNumber);

    /**
     * 获取全部的权限
     *
     * @return
     */
    List<Permission> listAll();
}