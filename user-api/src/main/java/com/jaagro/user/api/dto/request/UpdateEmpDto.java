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
     * 员工表id
     */
    private Integer id;

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

    /**
     * 员工角色
     */
    private Integer[] roleIds;
}
