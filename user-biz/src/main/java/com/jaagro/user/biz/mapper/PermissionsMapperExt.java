package com.jaagro.user.biz.mapper;

import java.util.List;

public interface PermissionsMapperExt extends PermissionsMapper {

    List<Integer> listPermissionIdsByRoleId(int roleId);
}