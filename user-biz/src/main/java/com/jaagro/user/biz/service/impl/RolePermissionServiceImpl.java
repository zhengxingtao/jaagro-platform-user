package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRolePsDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.service.RolePermissionService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author baiyiran
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    /**
     * 新增
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> createRole(CreateRoleDto dto) {
        return null;
    }

    /**
     * 修改
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> updateRole(UpdateRoleDto dto) {
        return null;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> deleteById(Long id) {
        return null;
    }

    /**
     * 根据角色id删除
     *
     * @param roleId
     * @return
     */
    @Override
    public Map<String, Object> deleteByRoleId(Long roleId) {
        return null;
    }

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getById(Long id) {
        return null;
    }

    /**
     * 根据角色id查询
     *
     * @param roleId
     * @return
     */
    @Override
    public Map<String, Object> getByRoleId(Long roleId) {
        return null;
    }

    /**
     * 分页查询
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> listByCriteria(ListRolePsDto dto) {
        return null;
    }
}
