package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class CreateDepartmentDto implements Serializable {
    /**
     * 部门表主键(网点表)
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 0-不是，1-是网点
     */
    private Boolean netpoint;

    /**
     * 上级部门id
     */
    private Integer parentId;

    /**
     * 部门主管ID
     */
    private Integer leaderEmployeeId;

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

    /**
     * 排序(越小越靠前)
     */
    private Integer sort;

}
