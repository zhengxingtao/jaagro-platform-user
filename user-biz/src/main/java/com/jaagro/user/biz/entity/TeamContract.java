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
public class TeamContract implements Serializable {
    /**
     * 主键车队合同表ID
     */
    private Long id;

    /**
     * 关联车队表ID
     */
    private Long truckId;

    /**
     * 关联部门ID
     */
    private Long departmentId;

    /**
     * 合同状态(1-正常 2-终止)
     */
    private Integer contractStatus;

    /**
     * 合同开始时间
     */
    private Date startDate;

    /**
     * 合同结束时间
     */
    private Date endDate;

    /**
     * 合同类型(1,运输合同;2,养殖合同;3,加盟合同;4,其他合同)
     */
    private Integer type;

    /**
     * 合同主题
     */
    private String theme;

    /**
     * 产品
     */
    private String product;

    /**
     * 合同正文
     */
    private String context;

    /**
     * 合同编号
     */
    private String contractNumber;

    /**
     * 备注信息
     */
    private String notes;

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

}