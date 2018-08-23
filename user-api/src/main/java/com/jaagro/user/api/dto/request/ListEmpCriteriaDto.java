package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class ListEmpCriteriaDto {

    /**
     * 起始页
     */
    private Integer pageNum;


    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 电话
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 部门id
     */
    private Long departmentId;


}
