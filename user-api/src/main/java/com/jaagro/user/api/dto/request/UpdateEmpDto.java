package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tony
 */
@Data
@Accessors(chain = true)
public class UpdateEmpDto implements Serializable {
    /**
     * 员工表自增
     */
    private Long id;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 登录账号
     */
    private String loginName;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 备注
     */
    private String notes;

    /**
     * 关联部门ID(references department)
     */
    private Long departmentId;
}
