package com.jaagro.user.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.service.RoleService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.entity.Role;
import com.jaagro.user.biz.entity.RolePermission;
import com.jaagro.user.biz.mapper.PermissionMapper;
import com.jaagro.user.biz.mapper.RoleMapper;
import com.jaagro.user.biz.mapper.RolePermissionMapper;
import com.jaagro.utils.ServiceResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author baiyiran
 */
@Service
public class RoleServiceImpl implements RoleService {

    private static final Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private UserService userService;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    /**
     * 新增
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> createRole(CreateRoleDto dto) {
        //新增角色
        Role role = new Role();
        BeanUtils.copyProperties(dto, role);
        role
                .setEnabled(true)
                .setCreateTime(new Date())
                .setCreateUserId(this.userService.getCurrentUser().getId());
        this.roleMapper.insertSelective(role);
        Integer[] permissionDtos = dto.getPermissionDtos();
        //新增角色权限
        for (int i = 0; i < permissionDtos.length; i++) {
            RolePermission rolePermission = new RolePermission();
            rolePermission
                    .setRoleId(role.getId())
                    .setPermissionId(permissionDtos[i])
                    .setCreateTime(new Date())
                    .setCreateUserId(this.userService.getCurrentUser().getId())
                    .setEnabled(true);
            this.rolePermissionMapper.insertSelective(rolePermission);
        }
        return ServiceResult.toResult(this.roleMapper.selectByPrimaryKey(role.getId()));
    }

    /**
     * 修改
     *
     * @param dto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> updateRole(UpdateRoleDto dto) {
        Role role = new Role();
        BeanUtils.copyProperties(dto, role);
        role
                .setModifyTime(new Date())
                .setModifyUserId(this.userService.getCurrentUser().getId());
        this.roleMapper.updateByPrimaryKeySelective(role);

        if (dto.getRolePermissions().length > 0) {
            this.rolePermissionMapper.deleteByRoleId(dto.getId());
        }
        for (int i = 0; i < dto.getRolePermissions().length; i++) {
            if (this.permissionMapper.selectByPrimaryKey(dto.getRolePermissions()[i]) == null) {
                log.error("\n【角色修改】--------角色权限不存在");
                throw new RuntimeException("角色权限不存在");
            }
            RolePermission rolePermission = new RolePermission();
            rolePermission
                    .setRoleId(role.getId())
                    .setPermissionId(dto.getRolePermissions()[i])
                    .setCreateTime(new Date())
                    .setCreateUserId(this.userService.getCurrentUser().getId())
                    .setEnabled(true);
            this.rolePermissionMapper.insertSelective(rolePermission);
        }
        return ServiceResult.toResult(this.roleMapper.selectByPrimaryKey(role.getId()));
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> deleteById(Integer id) {
        //删除角色表
        Role role = this.roleMapper.selectByPrimaryKey(id);
        role.setEnabled(false);
        this.roleMapper.updateByPrimaryKeySelective(role);
        //删除角色权限关联表
        this.rolePermissionMapper.deleteByRoleId(id);
        return ServiceResult.toResult("删除成功");
    }

    @Override
    public Map<String, Object> getRoleDetailById(Integer id) {
        return ServiceResult.toResult(this.roleMapper.getRoleDetailById(id));
    }

    /**
     * 分页查询
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> listRole(ListRoleCriteriaDto dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<Role> roles = this.roleMapper.listAll();
        return ServiceResult.toResult(new PageInfo<>(roles));
    }

}
