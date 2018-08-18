package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.department.CreateDepartmentDto;
import com.jaagro.user.api.dto.request.department.UpdateDepartmentDto;
import com.jaagro.user.api.service.DepartmentService;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import utils.BaseResponse;
import utils.ServiceResult;

/**
 * @author Administrator
        */
@RestController
@Api(value = "department", description = "部门管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentMapper departmentMapper;

    @ApiOperation("新增部门")
    @PostMapping("/department")
    public BaseResponse insertDepartment(@RequestBody CreateDepartmentDto department){
        return BaseResponse.service(departmentService.createDepartment(department));
    }

    @ApiOperation("修改部门")
    @PutMapping("/department")
    public BaseResponse updateDepartment(@RequestBody UpdateDepartmentDto department){
        if(departmentMapper.selectByPrimaryKey(department.getId()) == null){
            return BaseResponse.queryDataEmpty();
        }
        return BaseResponse.service(departmentService.updateById(department));
    }
}
