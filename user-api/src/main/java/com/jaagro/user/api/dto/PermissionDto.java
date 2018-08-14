package com.jaagro.user.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tony
 */
@Data
public class PermissionDto implements Serializable {

    private Integer permissionID;
    private String permissionInfo;
}
