package com.jaagro.user.biz.service.impl;

import com.jaagro.user.api.dto.request.CreateEmpDto;
import com.jaagro.user.api.dto.request.UpdateEmpDto;
import com.jaagro.user.api.service.EmployeeService;
import com.jaagro.user.api.service.UserService;
import com.jaagro.user.biz.entity.Employee;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.EmployeeMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
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

    @Override
    public Map<String, Object> updatePassword(Long id, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public Map<String, Object> resetPassword(String phoneNumber, String verificationCode) {
        return null;
    }

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

    @Override
    public Map<String, Object> setDepartmentCooperation(Long id, Long[] deptId) {
        return null;
    }
}
