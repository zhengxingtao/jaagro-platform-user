package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateRoleDto;
import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.service.EmployeeRoleService;
import com.jaagro.user.api.service.EmployeeService;
import com.jaagro.user.api.service.RoleService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import com.jaagro.user.biz.mapper.EmployeeRoleMapper;
import com.jaagro.user.biz.mapper.RoleMapper;
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
@Api(value = "role", description = "角色管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleService roleService;
    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;

    /**
     * 新增角色
     *
     * @param dto
     * @return
     */
    @ApiOperation("新增角色")
    @PostMapping("/role")
    public BaseResponse employee(@RequestBody CreateRoleDto dto) {
        if (StringUtils.isEmpty(dto.getName())) {
            return BaseResponse.errorInstance("角色名不能为空");
        }
        this.roleService.createRole(dto);
        return BaseResponse.successInstance("角色创建成功");
    }

    /**
     * 修改角色
     *
     * @param roleIds
     * @param empId
     * @return
     */
    @ApiOperation("修改角色")
    @PutMapping("/role")
    public BaseResponse employeeRole(@RequestBody UpdateRoleDto dto) {
        if (StringUtils.isEmpty(dto.getId())) {
            return BaseResponse.errorInstance("角色id不能为空");
        }
        this.roleService.updateRole(dto);
        return BaseResponse.successInstance("角色创建成功");
    }

    /**
     * 查询单个角色
     *
     * @param id
     * @return
     */
    @ApiOperation("查询单个角色")
    @GetMapping("/role/{id}")
    public BaseResponse getById(@PathVariable Long id) {
        if (this.roleMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到对应信息");
        }
        Map<String, Object> result = roleService.getById(id);
        return BaseResponse.service(result);
    }

    /**
     * 删除[逻辑]
     *
     * @param id
     * @return
     */
    @ApiOperation("删除部门[逻辑]")
    @DeleteMapping("/deleteRoleById/{id}")
    public BaseResponse deleteById(@PathVariable Long id) {
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
    public BaseResponse listByCriteria(@RequestBody ListRoleCriteriaDto criteriaDto) {
        return BaseResponse.service(this.roleService.listRole(criteriaDto));
    }

}
