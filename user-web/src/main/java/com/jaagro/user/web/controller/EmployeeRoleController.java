package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.UpdateEmpRoleDto;
import com.jaagro.user.api.service.EmployeeRoleService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import com.jaagro.user.biz.mapper.EmployeeRoleMapper;
import com.jaagro.user.biz.mapper.RoleMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import utils.BaseResponse;

import java.util.List;

/**
 * @author baiyiran
 */
@RestController
@Api(value = "employeeRole", description = "员工角色管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeRoleController {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;
    @Autowired
    private EmployeeRoleService employeeRoleService;
    @Autowired
    private UserService userService;

    /**
     * 新增员工角色
     *
     * @param roleIds
     * @param empId
     * @return
     */
    @ApiOperation("新增员工角色")
    @PostMapping("/employeeRole")
    public BaseResponse employee(@RequestParam(value = "roleIds") Long[] roleIds, @RequestParam(value = "empId") Long empId) {
        if (this.employeeMapper.selectByPrimaryKey(empId) == null) {
            return BaseResponse.errorInstance("员工[" + empId + "]不存在");
        }
        if (roleIds != null && roleIds.length > 0) {
            this.employeeRoleService.createEmp(roleIds, empId);
        }
        return BaseResponse.successInstance("员工角色创建成功");
    }

    /**
     * 修改员工角色
     *
     * @param dtos
     * @return
     */
    @ApiOperation("修改员工角色")
    @PutMapping("/employeeRole")
    public BaseResponse employeeRole(@RequestBody List<UpdateEmpRoleDto> dtos) {
        if (dtos != null && dtos.size() > 0) {
            for (UpdateEmpRoleDto dto : dtos) {
                if (this.employeeMapper.selectByPrimaryKey(dto.getEmployeeId()) == null) {
                    return BaseResponse.errorInstance("员工[" + dto.getEmployeeId() + "]不存在");
                }
                if (this.roleMapper.selectByPrimaryKey(dto.getRoleId()) == null) {
                    return BaseResponse.errorInstance("角色[" + dto.getRoleId() + "]不存在");
                }
            }
            this.employeeRoleService.updateEmpRole(dtos);
            return BaseResponse.successInstance("员工角色创建成功");
        }
        return BaseResponse.errorInstance("传入参数有误");
    }

}
