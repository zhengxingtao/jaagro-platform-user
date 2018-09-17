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
     * 部门名称
     */
    private String departmentName;

    /**
     * 上级部门id
     */
    private Long parentId;

    /**
     * 关联部门主管ID
     */
    private Long departmentManagerId;

    /**
     * 等级
     */
    private Integer level;

}
