package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.service.RoleService;
import com.jaagro.user.biz.mapper.EmployeeRoleMapper;
import com.jaagro.user.biz.mapper.PermissionMapper;
import com.jaagro.user.biz.mapper.RoleMapper;
import com.jaagro.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author baiyiran
 */
@RestController
@Api(value = "role", description = "角色管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleService roleService;
    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    /**
     * 新增角色
     *
     * @param dto
     * @return
     */
    @ApiOperation("新增角色")
    @PostMapping("/role")
    public BaseResponse createRole(@RequestBody CreateRoleDto dto) {
        if (StringUtils.isEmpty(dto.getName())) {
            return BaseResponse.errorInstance("角色名不能为空");
        }
        if (dto.getPermissionDtos() != null && dto.getPermissionDtos().length > 0) {
            return BaseResponse.service(this.roleService.createRole(dto));
        } else {
            return BaseResponse.successInstance("角色权限需设置");
        }
    }

    /**
     * 修改角色
     *
     * @param dto
     * @return
     */
    @ApiOperation("修改角色")
    @PutMapping("/role")
    public BaseResponse updateRole(@RequestBody UpdateRoleDto dto) {
        if (StringUtils.isEmpty(dto.getId())) {
            return BaseResponse.errorInstance("角色id不能为空");
        }
        if (roleMapper.getByName(dto) != null) {
            return BaseResponse.errorInstance("角色名称已存在");
        }
        try {
            return BaseResponse.service(roleService.updateRole(dto));
        } catch (Exception e) {
            return BaseResponse.errorInstance(e.getMessage());
        }
    }

    /**
     * 查询单个角色
     *
     * @param id
     * @return
     */
    @ApiOperation("查询单个角色")
    @GetMapping("/role/{id}")
    public BaseResponse getRoleById(@PathVariable Integer id) {
        if (this.roleMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到对应信息");
        }
        return BaseResponse.successInstance(roleMapper.selectByPrimaryKey(id));
    }

    /**
     * 查询单个角色[含角色权限]
     *
     * @param id
     * @return
     */
    @ApiOperation("查询单个角色[含角色权限]")
    @GetMapping("/roleDetail/{id}")
    public BaseResponse getRoleDetailById(@PathVariable Integer id) {
        if (this.roleMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到对应信息");
        }
        return BaseResponse.service(roleService.getRoleDetailById(id));
    }

    /**
     * 删除[逻辑]
     *
     * @param id
     * @return
     */
    @ApiOperation("删除角色[逻辑]")
    @DeleteMapping("/deleteRoleById/{id}")
    public BaseResponse deleteRoleById(@PathVariable Integer id) {
        if (this.roleMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到相应数据");
        }
        //查询员工角色关联表
        if (employeeRoleMapper.listByRoleId(id).size() > 0) {
            return BaseResponse.errorInstance("请先解除绑定此角色的员工");
        }
        return BaseResponse.service(this.roleService.deleteById(id));
    }

    /**
     * 分页查询
     *
     * @param criteriaDto
     * @return
     */
    @ApiOperation("分页查询角色")
    @PostMapping("/listRoleByCriteria")
    public BaseResponse listRoleByCriteria(@RequestBody ListRoleCriteriaDto criteriaDto) {
        return BaseResponse.service(this.roleService.listRole(criteriaDto));
    }

    /**
     * 分页查询角色权限列表
     *
     * @param criteriaDto
     * @return
     */
    @ApiOperation("分页查询角色权限")
    @PostMapping("/listRolePermByCriteria")
    public BaseResponse listRolePermByCriteria(@RequestBody ListRoleCriteriaDto criteriaDto) {
        return BaseResponse.service(this.roleService.listRole(criteriaDto));
    }

    /**
     * 查询全部权限
     *
     * @param criteriaDto
     * @return
     */
    @ApiOperation("查询全部权限")
    @PostMapping("/listAllPermission")
    public BaseResponse listAllPermission() {
        return BaseResponse.successInstance(this.permissionMapper.listAll());
    }
}
