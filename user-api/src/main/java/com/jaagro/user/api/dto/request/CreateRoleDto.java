package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class CreateRoleDto implements Serializable {

    /**
     * 角色名(管理员)
     */
    private String name;

    /**
     * 描述
     */
    private String notes;

    /**
     * 角色权限
     */
    Integer[] permissionDtos;

}
