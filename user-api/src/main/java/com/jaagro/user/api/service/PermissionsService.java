package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.response.MenuReturnDto;

import java.util.List;

/**
 * @author baiyiran
 */
public interface PermissionsService {

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
    List<MenuReturnDto> listMenuByCurrentUser();

    /**
     * 根据权限id判断当前用户是否有此权限
     *
     * 提供给前端使用，用于判断当前用户是否有此操作权限
     * @param permissionId
     * @return
     */
    boolean isHavePermission(int permissionId);
}
