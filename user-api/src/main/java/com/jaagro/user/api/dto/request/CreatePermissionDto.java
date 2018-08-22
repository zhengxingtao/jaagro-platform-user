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
public class CreatePermissionDto implements Serializable {

    /**
     * 权限编号
     */
    private String permissionNumber;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 权限说明
     */
    private String notes;

}
