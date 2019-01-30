package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.response.ReturnPermissionDto;

import java.util.List;

/**
 * @author baiyiran
 */
public interface PermissionService {
    /**
     * 通过roleId获取permission列表
     *
     * @param roleId
     * @return
     */
    List<ReturnPermissionDto> listPermissionByRoleId(int roleId);
}
