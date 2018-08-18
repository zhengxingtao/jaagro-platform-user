package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class CustomerUser implements Serializable {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 登录用户名(默认使用手机号码)
     */
    private String loginName;

    /**
     * 登录密码(加盐,加密)
     */
    private String password;

    /**
     * 加盐值
     */
    private String salt;

    /**
     * 显示名称
     */
    private String username;

    /**
     * 用户的头像(存储头像的路径)
     */
    private String avatar;

    /**
     * 所属客户
     */
    private Integer customerId;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 系统状态  枚举类型:0 注销 ;1  正常
     */
    private Integer userStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

}