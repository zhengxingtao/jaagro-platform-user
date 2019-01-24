package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.response.ReturnPermissionDto;
import com.jaagro.user.api.service.PermissionService;
import com.jaagro.user.biz.mapper.PermissionMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author baiyiran
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapperExt permissionMapperExt;

    @Override
    public List<ReturnPermissionDto> listPermissionByRoleId(int roleId) {
        return null;
    }
}
