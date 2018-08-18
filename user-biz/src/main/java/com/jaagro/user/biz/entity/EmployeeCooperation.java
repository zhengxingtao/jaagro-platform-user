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
    private Long id;

    /**
     * 关联员工ID(references employee)
     */
    private Long employeeId;

    /**
     * 关联部门ID(references deptment)
     */
    private Long deptId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Long modifyUser;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;

}