package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.CreateEmpDto;
import com.jaagro.user.api.dto.request.UpdateEmpDto;
import com.jaagro.user.api.service.EmployeeService;
import com.jaagro.user.biz.entity.Employee;
import com.jaagro.user.biz.entity.EmployeeCooperation;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.EmployeeCooperationMapper;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import utils.BaseResponse;
import utils.PasswordEncoder;
import utils.ServiceResult;

import java.util.Date;
import java.util.Map;

/**
 * @author baiyiran
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeCooperationMapper cooperationMapper;

    /**
     * 新增
     *
     * @param dto
     * @return
     */
    @Transactional
    @Override
    public Map<String, Object> createEmployee(CreateEmpDto dto) {
        if (StringUtils.isEmpty(dto.getPassword())) {
            throw new RuntimeException("密码不能为空");
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(dto, employee);
        Map<String, String> stringMap = PasswordEncoder.encodePassword(dto.getPassword());
        if (stringMap.size() > 0) {
            employee
                    .setStatus(true)
                    .setSalt(stringMap.get("salt"))
                    .setPassword(stringMap.get("password"))
                    .setCreateTime(new Date())
                    .setCreateUser(1L);

            this.employeeMapper.insert(employee);
            return ServiceResult.toResult("员工创建成功");
        } else {
            throw new RuntimeException("密码加密失败");
        }
    }

    /**
     * 注意：不允许修改创建时间， 状态，密码、盐等字段，只允许修改基本信息
     *
     * @param dto
     * @return
     */
    @Override
    public Map<String, Object> updateEmployee(UpdateEmpDto dto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(dto, employee);
        employee
                .setModifyUser(1L)
                .setModifyTime(new Date());
        this.employeeMapper.updateByPrimaryKeySelective(employee);
        return ServiceResult.toResult("员工修改成功");
    }

    /**
     * 注意新老密码的匹配，使用common工具可以解决
     *
     * @param id
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @Override
    public Map<String, Object> updatePassword(Long id, String oldPassword, String newPassword) {
        if (!PasswordEncoder.encodePassword(this.employeeMapper.selectByPrimaryKey(id).getPassword()).get("password").equals(PasswordEncoder.encodePassword(oldPassword).get("password"))) {
            return ServiceResult.error("原密码不正确");
        }
        Employee employee = new Employee();
        employee
                .setId(id)
                .setModifyUser(1L)
                .setModifyTime(new Date())
                .setSalt(PasswordEncoder.encodePassword(newPassword).get("salt"))
                .setPassword(PasswordEncoder.encodePassword(newPassword).get("password"));
        return ServiceResult.toResult("员工修改密码成功");
    }

    /**
     * 重置密码
     *
     * @param phoneNumber      employee表中的手机号码字段
     * @param verificationCode 短信验证码
     * @return
     */
    @Override
    public Map<String, Object> resetPassword(String phoneNumber, String verificationCode) {
        return null;
    }

    /**
     * 注销员工
     *
     * @param id    id
     * @param notes 注销原因
     * @return
     */
    @Override
    public Map<String, Object> disableEmployee(Long id, String notes) {
        Employee employee = new Employee();
        employee
                .setId(id)
                .setNotes(notes)
                .setStatus(false)
                .setModifyUser(1L)
                .setModifyTime(new Date());
        this.employeeMapper.updateByPrimaryKeySelective(employee);
        return ServiceResult.toResult("注销员工成功");
    }

    /**
     * 设置员工需协作部门
     *
     * @param id
     * @param deptId 需要协作的部门编号，新增到 employee_dept表中
     * @return
     */
    @Override
    public Map<String, Object> setDepartmentCooperation(Long id, Long[] deptId) {
        for (Long did : deptId) {
            EmployeeCooperation cooperation = new EmployeeCooperation();
            cooperation
                    .setCreateUser(1L)
                    .setCreateTime(new Date())
                    .setDeptId(did)
                    .setEmployeeId(id)
                    .setEnabled(true);
            cooperationMapper.insert(cooperation);
        }
        return ServiceResult.toResult("员工协作部门创建成功");
    }
}
