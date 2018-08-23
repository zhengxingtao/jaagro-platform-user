package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tony
 */
@Data
@Accessors(chain = true)
public class BusinessSupport implements Serializable {
    /**
     * 业务支持ID
     */
    private Integer id;

    /**
     * 1-帮网点下单 2…
     */
    private Integer supportType;

    /**
     * 员工ID
     */
    private Integer employeeId;

    /**
     * 部门ID
     */
    private Integer departmentId;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 修改人
     */
    private Integer modifyUserId;
}