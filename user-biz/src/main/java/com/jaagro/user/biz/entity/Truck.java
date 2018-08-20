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
public class Truck implements Serializable {
    /**
     * 主键车队表ID
     */
    private Long id;

    /**
     * 车队名称
     */
    private String teamName;

    /**
     * 法人姓名
     */
    private String legalName;

    /**
     * 身份证号
     */
    private String card;

    /**
     * 所属城市
     */
    private String city;

    /**
     * 详细地址
     */
    private String address;

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
     * 车队类型(1 个体 2 自有 3 车队)
     */
    private Integer truckType;

    /**
     * 付款账号
     */
    private String paymentAccountId;

    /**
     * 开户银行
     */
    private String depositBank;

    /**
     * 开户人
     */
    private String accountPerson;

    /**
     * 统一社会信用码
     */
    private String creditCode;

    /**
     * 开票抬头
     */
    private String invoiceTitle;

    /**
     * 税务编号
     */
    private String taxNumber;

    /**
     * 备注信息
     */
    private String notes;

}