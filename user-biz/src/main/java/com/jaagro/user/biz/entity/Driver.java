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
public class Driver implements Serializable {
    /**
     * 主键司机ID
     */
    private Long id;

    /**
     * 关联车辆表ID
     */
    private Long vehicleId;

    /**
     * 司机姓名
     */
    private String driverName;

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
     * 账号状态(0;注销 1；正常)
     */
    private Integer status;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 修改日期
     */
    private Date modifyTime;

    /**
     * 创建人(关联用户ID)
     */
    private Long createUser;

    /**
     * 修改人(关联用户ID)
     */
    private Long modifyUser;

    /**
     * 备注
     */
    private String notes;

    /**
     * 所属城市
     */
    private String city;

    /**
     * 所属省份
     */
    private String province;

    /**
     * 所属区县
     */
    private String county;

    /**
     * 详细地址
     */
    private String address;

}