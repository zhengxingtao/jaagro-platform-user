package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class UpdateRoleDto implements Serializable {
    /**
     * 角色表主键
     */
    private Integer id;

    /**
     * 角色名(管理员)
     */
    private String name;

    /**
     * 描述
     */
    private String notes;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;
}
