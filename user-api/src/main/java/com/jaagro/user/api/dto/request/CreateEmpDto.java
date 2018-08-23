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
public class CreateEmpDto implements Serializable {
    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 所属部门ID
     */
    private Integer departmentId;

    /**
     * 登录账号
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String phone;

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
    private String birthday;

    /**
     * 备注
     */
    private String notes;

    /**
     * 性别
     */
    private Integer gender;

}
