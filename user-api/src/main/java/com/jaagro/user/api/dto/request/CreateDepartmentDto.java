package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class CreateDepartmentDto implements Serializable {
    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 上级部门id
     */
    private Integer parentId;

    /**
     * 关联部门主管ID
     */
    private Integer leaderEmployeeId;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区县
     */
    private String county;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;

}
