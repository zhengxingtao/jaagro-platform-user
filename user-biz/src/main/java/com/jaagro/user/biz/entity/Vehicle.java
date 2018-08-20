package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class Vehicle implements Serializable {
    /**
     * 主键车辆表ID
     */
    private Long id;

    /**
     * 关联车队表ID
     */
    private Long truckId;

    /**
     * 关联审核表ID
     */
    private Long customerVerifyLogId;

    /**
     * 车牌号码
     */
    private String plateNumber;

    /**
     * 车辆类型(9吨车型,12吨车型,20吨车型)
     */
    private Integer vehicleTypeId;

    /**
     * 营运证号
     */
    private String businessPermit;

    /**
     * 最大载重
     */
    private BigDecimal capacity;

    /**
     * 装载数量
     */
    private Integer maximumLoad;

    /**
     * 车辆自重
     */
    private BigDecimal vehicleWeight;

    /**
     * 预设司机
     */
    private Long userId;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 证件号码
     */
    private String cardNumber;

    /**
     * 备注信息
     */
    private String notes;

    /**
     * 修改日期
     */
    private Date modifyTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人(关联用户ID)
     */
    private Long modifyUser;

    /**
     * 创建人(关联用户ID)
     */
    private Long createUserId;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;

    /**
     * 年检到期时间
     */
    private Date expiryAnnual;

    /**
     * 驾驶证到期时间
     */
    private Date expiryDrivingLicense;

    /**
     * 保险到期时间
     */
    private Date expiryDate;

}