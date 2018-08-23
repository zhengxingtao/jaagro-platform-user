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
public class EmployeeCooperation implements Serializable {
    /**
     * 主键员工部门ID
     */
    private Integer id;

    /**
     * 关联员工ID(references employee)
     */
    private Integer employeeId;

    /**
     * 关联部门ID(references deptment)
     */
    private Integer deptId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Integer modifyUserId;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;
}