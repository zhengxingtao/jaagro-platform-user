package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateEmpDto;
import com.jaagro.user.api.dto.request.UpdateEmpDto;
import com.jaagro.user.api.service.EmployeeService;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import utils.BaseResponse;

/**
 * @author baiyiran
 */
@RestController
@Api(value = "employee", description = "员工管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;


    @ApiOperation("新增员工")
    @PostMapping("/employee")
    public BaseResponse insert(@RequestBody CreateEmpDto createEmpDto) {
        if (StringUtils.isEmpty(createEmpDto.getEmployeeName())) {
            return BaseResponse.errorInstance("员工姓名[employeeName]不能为空");
        }
        if (StringUtils.isEmpty(createEmpDto.getLoginName())) {
            return BaseResponse.errorInstance("登录账号[loginName]不能为空");
        }
        if (StringUtils.isEmpty(createEmpDto.getPassword())) {
            return BaseResponse.errorInstance("登录密码[password]不能为空");
        }
        if (StringUtils.isEmpty(createEmpDto.getPhoneNumber())) {
            return BaseResponse.errorInstance("手机号码[phoneNumber]不能为空");
        }
        if (StringUtils.isEmpty(createEmpDto.getDepartmentId())) {
            return BaseResponse.idNull("关联部门ID[departmentId]不能为空");
        }
        if (this.departmentMapper.selectByPrimaryKey(createEmpDto.getDepartmentId()) == null) {
            return BaseResponse.errorInstance("部门ID[departmentId]不存在");
        }
        //判断登陆账号和手机号是否已存在
        UpdateEmpDto updateEmpDto = new UpdateEmpDto();
        updateEmpDto
                .setLoginName(createEmpDto.getLoginName())
                .setPhoneNumber(createEmpDto.getPhoneNumber());
        if (this.employeeMapper.getByUpdateDto(updateEmpDto) != null) {
            return BaseResponse.errorInstance("登陆账号或手机号码已存在");
        }
        //新增
        this.employeeService.createEmployee(createEmpDto);
        return BaseResponse.successInstance("员工创建成功");
    }

    @ApiOperation("删除员工[逻辑]")
    @DeleteMapping("deleteEmpById/{id}")
    public BaseResponse deleteById(@PathVariable Long id, @PathVariable String notes) {
        if (this.employeeMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("没有相应的员工数据");
        }
        this.employeeService.disableEmployee(id, notes);
        return BaseResponse.successInstance("删除员工成功");
    }

    @ApiOperation("修改员工")
    @PutMapping("/employee")
    public BaseResponse updateById(@RequestBody UpdateEmpDto updateEmpDto) {
        if (StringUtils.isEmpty(updateEmpDto.getLoginName())) {
            return BaseResponse.errorInstance("登录账号[loginName]不能为空");
        }
        if (StringUtils.isEmpty(updateEmpDto.getPhoneNumber())) {
            return BaseResponse.errorInstance("手机号码[phoneNumber]不能为空");
        }
        if (StringUtils.isEmpty(updateEmpDto.getDepartmentId())) {
            return BaseResponse.idNull("关联部门ID[departmentId]不能为空");
        }
        if (this.departmentMapper.selectByPrimaryKey(updateEmpDto.getDepartmentId()) == null) {
            return BaseResponse.errorInstance("部门ID[departmentId]不存在");
        }
        //判断登陆账号和手机号是否已存在
        if (this.employeeMapper.getByUpdateDto(updateEmpDto) != null) {
            return BaseResponse.errorInstance("登陆账号或手机号码已存在");
        }
        this.employeeService.updateEmployee(updateEmpDto);
        return BaseResponse.successInstance("员工修改成功");
    }


}
