package com.jaagro.user.api.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tony
 */
@Data
@Accessors(chain = true)
public class ReturnEmpDto implements Serializable {
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
     * 登录密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 密码加盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 账号状态(0;注销 1；正常)
     */
    private Boolean status;

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
     * 创建日期
     */
    private Date createTime;

    /**
     * 修改日期
     */
    private Date modifyTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 修改人
     */
    private Long modifyUser;

    /**
     * 备注
     */
    private String notes;

    /**
     * 关联部门ID(references department)
     */
    private Long departmentId;
}
