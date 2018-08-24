package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class CreateRolePermissionDto implements Serializable {

    /**
     * 关联角色ID
     */
    private Integer roleId;

    /**
     * 关联权限ID
     */
    private Integer permissionId;

}
