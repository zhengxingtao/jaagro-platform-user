package com.jaagro.user.web.controller;

import com.jaagro.constant.UserInfo;
import com.jaagro.user.api.dto.request.*;
import com.jaagro.user.api.service.EmployeeRoleService;
import com.jaagro.user.api.service.EmployeeService;
import com.jaagro.user.biz.entity.Employee;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import com.jaagro.user.biz.mapper.EmployeeRoleMapper;
import com.jaagro.user.biz.mapper.RoleMapper;
import com.jaagro.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private EmployeeRoleMapper employeeRoleMapper;
    @Autowired
    private EmployeeRoleService employeeRoleService;

    /**
     * 新增员工
     *
     * @param createEmpDto
     * @return
     */
    @ApiOperation("新增员工")
    @PostMapping("/employee")
    public BaseResponse employee(@RequestBody CreateEmpDto createEmpDto) {
        if (StringUtils.isEmpty(createEmpDto.getEmployeeName())) {
            return BaseResponse.errorInstance("员工姓名[employeeName]不能为空");
        }
        if (StringUtils.isEmpty(createEmpDto.getLoginName())) {
            return BaseResponse.errorInstance("登录账号[loginName]不能为空");
        }
        if (StringUtils.isEmpty(createEmpDto.getPassword())) {
            return BaseResponse.errorInstance("登录密码[password]不能为空");
        }
        if (StringUtils.isEmpty(createEmpDto.getPhone())) {
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
                .setPhone(createEmpDto.getPhone());
        if (this.employeeMapper.getByUpdateDto(updateEmpDto) != null) {
            return BaseResponse.errorInstance("登陆账号或手机号码已存在");
        }
        //新增
        this.employeeService.createEmployee(createEmpDto);
        return BaseResponse.successInstance("员工创建成功");
    }

    /**
     * 删除
     *
     * @param id
     * @param notes
     * @return
     */
    @ApiOperation("删除员工[逻辑]")
    @DeleteMapping("deleteEmpById/{id}/{notes}")
    public BaseResponse deleteById(@PathVariable Integer id, @PathVariable String notes) {
        if (this.employeeMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("没有相应的员工数据");
        }
        this.employeeService.disableEmployee(id, notes);
        return BaseResponse.successInstance("删除员工成功");
    }

    /**
     * 修改员工基本信息
     *
     * @param updateEmpDto
     * @return
     */
    @ApiOperation("修改基本信息[包括员工角色]")
    @PutMapping("/employee")
    public BaseResponse employee(@RequestBody UpdateEmpDto updateEmpDto) {
        if (StringUtils.isEmpty(updateEmpDto.getLoginName())) {
            return BaseResponse.errorInstance("登录账号[loginName]不能为空");
        }
        if (StringUtils.isEmpty(updateEmpDto.getPhone())) {
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

    /**
     * 修改员工密码
     *
     * @param oldPassword
     * @param newPassword
     * @param id
     * @return
     */
    @ApiOperation("修改密码")
    @PostMapping("/updateEmpPassword")
    public BaseResponse updateEmpPassword(@RequestParam(value = "oldPassword") String oldPassword,
                                          @RequestParam(value = "newPassword") String newPassword,
                                          @RequestParam(value = "id") Integer id) {
        Employee employee = this.employeeMapper.selectByPrimaryKey(id);
        if (employee == null) {
            return BaseResponse.errorInstance("此员工不存在:id:" + id);
        }
        try {
            this.employeeService.updatePassword(id, oldPassword, newPassword);
        } catch (RuntimeException e) {
            return BaseResponse.errorInstance(e.getMessage());
        }
        return BaseResponse.successInstance("员工修改密码成功");
    }

    /**
     * 重置密码
     *
     * @param phoneNumber
     * @param verificationCode
     * @param newPassword
     * @return
     */
    @ApiOperation("重置密码")
    @PostMapping("/resetPassword")
    public BaseResponse resetPassword(@RequestParam(value = "phone") String phone,
                                      @RequestParam(value = "verificationCode") String verificationCode,
                                      @RequestParam(value = "newPassword") String newPassword) {
        UserInfo userInfo = this.employeeMapper.getByphone(phone);
        if (userInfo == null) {
            return BaseResponse.errorInstance("此员工不存在:phone:" + phone);
        }
        try {
            this.employeeService.resetPassword(phone, verificationCode, newPassword);
        } catch (RuntimeException e) {
            return BaseResponse.errorInstance(e.getMessage());
        }
        return BaseResponse.successInstance("重置密码成功");
    }

    /**
     * 创建员工需协作部门
     *
     * @param departmentIds
     * @param id
     * @return
     */
    @ApiOperation("创建员工需协作部门")
    @PostMapping("/createEmpDepartment")
    public BaseResponse createEmpDepartment(@RequestParam(value = "departmentIds") Integer[] departmentIds, @RequestParam(value = "id") Integer id) {
        if (this.employeeMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("员工[id:" + id + "]不存在");
        }
        if (departmentIds.length > 0) {
            for (Integer did : departmentIds) {
                if (this.departmentMapper.selectByPrimaryKey(did) == null) {
                    return BaseResponse.errorInstance("部门[id:" + did + "]不存在");
                }
            }
        } else {
            return BaseResponse.errorInstance("部门ids不能为空");
        }
        this.employeeService.setDepartmentCooperation(id, departmentIds);
        return BaseResponse.successInstance("员工协作部门创建成功");
    }

    /**
     * 单个查询
     *
     * @param id
     * @return
     */
    @ApiOperation("查询单个员工")
    @GetMapping("/getEmpById/{id}")
    public BaseResponse getEmp(@PathVariable Integer id) {
        if (this.employeeMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("员工不存在");
        }
        return BaseResponse.successInstance(this.employeeMapper.selectByPrimaryKey(id));
    }

    /**
     * 根据部门id查询员工列表
     *
     * @param
     * @return
     */
    @ApiOperation("根据部门id查询员工列表")
    @GetMapping("/getEmpByDeptId/{deptId}")
    public BaseResponse getEmpByDeptId(@PathVariable Integer deptId) {
        if (this.departmentMapper.selectByPrimaryKey(deptId) == null) {
            return BaseResponse.errorInstance("部门不存在");
        }
        return BaseResponse.successInstance(this.employeeMapper.listByDeptId(deptId));
    }

    /**
     * 分页查询
     *
     * @param criteriaDto
     * @return
     */
    @ApiOperation("分页查询员工")
    @PostMapping("/listEmpByCriteria")
    public BaseResponse listEmpByCriteria(@RequestBody ListEmpCriteriaDto criteriaDto) {
        return BaseResponse.service(this.employeeService.listByCriteria(criteriaDto));
    }

}
