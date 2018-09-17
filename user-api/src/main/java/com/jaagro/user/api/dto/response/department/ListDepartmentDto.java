package com.jaagro.user.api.dto.response.department;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class ListDepartmentDto implements Serializable {

    /**
     * 部门表主键(网点表)
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 子部门列表
     */
    private List<ListDepartmentDto> departmentDtoList;

}
