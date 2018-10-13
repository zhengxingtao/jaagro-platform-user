package com.jaagro.user.api.service;

import com.jaagro.user.api.dto.request.CreateEmpDto;
import com.jaagro.user.api.dto.request.ListEmpCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateEmpDto;
import com.jaagro.user.api.dto.response.employee.DeleteEmployeeDto;
import com.jaagro.user.api.dto.response.employee.GetEmployeeDto;

import java.util.Map;

/**
 * @author tony
 */
public interface EmployeeService {

    /**
     * employee单表新增
     * 注意调用 common中的密码加密工具: PasswordEncoder
     *
     * @param dto
     * @return
     */
    Map<String, Object> createEmployee(CreateEmpDto dto);

    /**
     * 注意：不允许修改创建时间， 状态，密码、盐等字段，只允许修改基本信息
     *
     * @param dto
     * @return
     */
    Map<String, Object> updateEmployee(UpdateEmpDto dto);

    /**
     * 注意新老密码的匹配，使用common工具可以解决
     *
     * @param id
     * @param oldPassword
     * @param newPassword
     * @return
     */
    Map<String, Object> updatePassword(Integer id, String oldPassword, String newPassword);

    /**
     * 校验验证码
     *
     * @param phone
     * @param verificationCode
     * @return
     */
    Map<String, Object> resetPassword(String phone, String verificationCode);

    /**
     * 注销员工
     *
     * @param id    id
     * @param notes 注销原因
     * @return
     */
    Map<String, Object> disableEmployee(DeleteEmployeeDto deleteEmployeeDto);

    /**
     * 设置员工需协作部门
     *
     * @param id
     * @param deptId 需要协作的部门编号，新增到 employee_dept表中
     * @return
     */
    Map<String, Object> setDepartmentCooperation(Integer id, Integer[] deptId);

    /**
     * 分页查询
     *
     * @param criteriaDto
     * @return
     */
    Map<String, Object> listByCriteria(ListEmpCriteriaDto criteriaDto);

    /**
     * 查询单个员工
     *
     * @param id
     * @return
     */
    GetEmployeeDto getById(Integer id);
}
