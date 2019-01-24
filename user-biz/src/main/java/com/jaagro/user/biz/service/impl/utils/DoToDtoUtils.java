package com.jaagro.user.biz.service.impl.utils;

import com.jaagro.user.api.dto.response.GetRoleDto;
import com.jaagro.user.biz.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author tonyZheng
 * @date 2019-01-24 15:53
 */
@Mapper
public interface DoToDtoUtils {
    DoToDtoUtils INSTANCE = Mappers.getMapper(DoToDtoUtils.class);

    GetRoleDto toGetRoleDto(Role role);
    List<GetRoleDto> toGetRoleDtoList(List<Role> roleList);
}
