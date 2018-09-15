package com.jaagro.user.web.controller;

import com.jaagro.user.api.dto.request.CreateDepartmentDto;
import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateDepartmentDto;
import com.jaagro.user.api.service.DepartmentService;
import com.jaagro.user.biz.mapper.DepartmentMapper;
import com.jaagro.user.biz.mapper.DepartmentMapperExt;
import com.jaagro.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Administrator
        */
@RestController
@Api(value = "department", description = "部门管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentMapperExt departmentMapper;

    @ApiOperation("新增部门")
    @PostMapping("/department")
    public BaseResponse insertDepartment(@RequestBody CreateDepartmentDto department){
        return BaseResponse.service(departmentService.createDepartment(department));
    }

    @ApiOperation("修改部门")
    @PutMapping("/department")
    public BaseResponse updateDepartment(@RequestBody UpdateDepartmentDto department){
        if(departmentMapper.selectByPrimaryKey(department.getId()) == null){
            return BaseResponse.errorInstance("查询不到部门");
        }
        return BaseResponse.service(departmentService.updateById(department));
    }

    @ApiOperation("查询单个部门")
    @GetMapping("/customer/{id}")
    public BaseResponse getById(@PathVariable Integer id) {
        if (this.departmentMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到部门ID");
        }
        Map<String, Object> result = departmentService.getById(id);
        return BaseResponse.service(result);
    }

    @ApiOperation("删除部门[逻辑]")
    @DeleteMapping("/deleteById/{id}")
    public BaseResponse deleteById(@PathVariable Integer id) {
        if (this.departmentMapper.selectByPrimaryKey(id) == null) {
            return BaseResponse.errorInstance("查询不到相应数据");
        }
        return BaseResponse.service(this.departmentService.disableDepartment(id));
    }

    @ApiOperation("分页查询部门")
    @PostMapping("/getByCriteria")
    public BaseResponse listByCriteria(@RequestBody ListDepartmentCriteriaDto criteriaDto) {
        return BaseResponse.service(this.departmentService.listByCriteria(criteriaDto));
    }
}
