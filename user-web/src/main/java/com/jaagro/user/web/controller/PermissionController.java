package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreatePermissionDto;
import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.service.PermissionService;
import com.jaagro.user.api.service.RoleService;
import com.jaagro.user.biz.mapper.EmployeeRoleMapper;
import com.jaagro.user.biz.mapper.PermissionMapper;
import com.jaagro.user.biz.mapper.RoleMapper;
import com.jaagro.user.biz.mapper.RolePermissionMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import utils.BaseResponse;

import java.util.Map;

/**
 * @author baiyiran
 */
@RestController
@Api(value = "permission", description = "权限管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class PermissionController {

    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private PermissionService permissionService;

    /**
     * 新增权限
     *
     * @param dto
     * @return
     */
    @ApiOperation("新增权限")
    @PostMapping("/role")
    public BaseResponse employee(@RequestBody CreatePermissionDto dto) {
        if (StringUtils.isEmpty(dto.getAccessNumber())) {
            return BaseResponse.errorInstance("角色名不能为空");
        }
        if (this.permissionMapper.getByNumber(dto.getAccessNumber()) != null) {
            return BaseResponse.errorInstance("权限编号已存在");
        }
        return BaseResponse.successInstance("权限创建成功");
    }

    /**
     * 修改权限
     *
     * @param roleIds
     * @param empId
     * @return
     */
    @ApiOperation("修改权限")
    @PutMapping("/role")
    public BaseResponse employeeRole(@RequestBody UpdateRoleDto dto) {
        if (StringUtils.isEmpty(dto.getId())) {
            return BaseResponse.errorInstance("权限id不能为空");
        }
        return BaseResponse.successInstance("权限修改成功");
    }

    /**
     * 查询单个权限
     *
     * @param id
     * @return
     */
    @ApiOperation("查询单个权限")
    @GetMapping("/role/{id}")
    public BaseResponse getById(@PathVariable Long id) {
        if (this.permissionMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到对应信息");
        }
        return BaseResponse.successInstance(null);
    }

    /**
     * 删除权限[逻辑]
     *
     * @param id
     * @return
     */
    @ApiOperation("删除权限[逻辑]")
    @DeleteMapping("/deleteRoleById/{id}")
    public BaseResponse deleteById(@PathVariable Long id) {
        if (this.permissionMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到相应数据");
        }
        return BaseResponse.successInstance(null);
    }

    /**
     * 分页查询权限
     *
     * @param criteriaDto
     * @return
     */
    @ApiOperation("分页查询角色")
    @PostMapping("/listRolePermissionByCriteria")
    public BaseResponse listRolePermissionByCriteria(@RequestBody ListRoleCriteriaDto criteriaDto) {
        return BaseResponse.service(null);
    }

}
