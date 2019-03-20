package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.response.MenuReturnDto;

import java.util.List;

/**
 * @author tony
 */
public interface MenuMapperExt extends MenuMapper {

    List<MenuReturnDto> listAllMenu();
}