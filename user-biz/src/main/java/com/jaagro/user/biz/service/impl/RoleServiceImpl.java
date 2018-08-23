package com.jaagro.user.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.service.RoleService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.entity.Role;
import com.jaagro.user.biz.mapper.RoleMapper;
import com.jaagro.user.biz.mapper.RolePermissionMapper;
import com.jaagro.utils.ServiceResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author baiyiran
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolePermissionMapper permissionMapper;

    /**
     * 新增
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> createRole(CreateRoleDto dto) {
        Role role = new Role();
        BeanUtils.copyProperties(dto, role);
        role
                .setEnabled(true)
                .setCreateTime(new Date())
                .setCreateUserId(this.userService.getCurrentUser().getId());
        this.roleMapper.insert(role);
        return ServiceResult.toResult("创建成功");
    }

    /**
     * 修改
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> updateRole(UpdateRoleDto dto) {
        Role role = new Role();
        BeanUtils.copyProperties(dto, role);
        role
                .setModifyTime(new Date())
                .setModifyUserId(this.userService.getCurrentUser().getId());
        this.roleMapper.updateByPrimaryKeySelective(role);
        return ServiceResult.toResult("修改成功");
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
        this.permissionMapper.deleteByRoleId(id);
        return ServiceResult.toResult("删除成功");
    }

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getById(Integer id) {
        return ServiceResult.toResult(this.roleMapper.getById(id));
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
