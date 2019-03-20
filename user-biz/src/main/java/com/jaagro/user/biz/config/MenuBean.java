package com.jaagro.user.biz.config;

import com.jaagro.user.api.dto.response.MenuReturnDto;
import com.jaagro.user.biz.mapper.MenuMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author tonyZheng
 * @date 2019-03-19 17:55
 */
@Component
public class MenuBean {

    private static MenuMapperExt menuMapperExt;

    private static List<MenuReturnDto> menus;

    @Autowired
    public void setMenuMapperExt(MenuMapperExt menuMapperExt) {
        MenuBean.menuMapperExt = menuMapperExt;
    }

    public static List<MenuReturnDto> listMenu() {
        if (null != menus) {
            return menus;
        } else {
            return menuMapperExt.listAllMenu();
        }
    }
}
