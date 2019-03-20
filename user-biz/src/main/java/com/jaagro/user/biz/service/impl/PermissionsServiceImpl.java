package com.jaagro.user.biz.service.impl;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.dto.response.MenuReturnDto;
import com.jaagro.user.api.dto.response.RoleReturnDto;
import com.jaagro.user.api.service.PermissionsService;
import com.jaagro.user.api.service.RoleService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.config.MenuBean;
import com.jaagro.user.biz.mapper.MenuMapperExt;
import com.jaagro.user.biz.mapper.PermissionsMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author tonyZheng
 */
@Service
public class PermissionsServiceImpl implements PermissionsService {

    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionsMapperExt permissionsMapper;
    @Autowired
    private UserService userService;

    /**
     * 主要提供给auth微服务调用，用于授权中心获取当前用户的权限列表
     * <p>
     * permissions核心方法
     * <p>
     * 根据userId首先获取到user对应的role，
     * 然后依据role获取当前role对应的permissions，
     * 最后根据permission获取对应的menu列表并返回
     *
     * @return 菜单列表
     */
    @Override
    public List<MenuReturnDto> listMenuByCurrentUser() {
        UserInfo userInfo = userService.getCurrentUser();
        if(null == userInfo){
            throw new NullPointerException("User does not exist");
        }
        List<RoleReturnDto> listRoleReturnDto = roleService.listRoleByUserId(userInfo.getId());
        Set<Integer> permissionsIdSet = new HashSet<>();
        for (RoleReturnDto rd : listRoleReturnDto) {
            List<Integer> listPermissionIds = permissionsMapper.listPermissionIdsByRoleId(rd.getId());
            permissionsIdSet.addAll(listPermissionIds);
        }
        Set<MenuReturnDto> menuSet = new HashSet<>();
        for (int p : permissionsIdSet) {
            menuSet.addAll(this.getMenuByPermission(p));
        }
        menuSet.removeAll(Collections.singleton(null));
        return new ArrayList<>(menuSet);
    }

    @Override
    public boolean isHavePermission(int permissionId) {
        return false;
    }

    private Set<MenuReturnDto> getMenuByPermission(Integer permissionId) {
        Set<MenuReturnDto> menuSet =new HashSet<>();
        for (MenuReturnDto menu : MenuBean.listMenu()) {
            if (menu.getPermissions().contains(permissionId.toString())) {
                menuSet.add(menu);
            }
        }
        return menuSet;
    }

}
