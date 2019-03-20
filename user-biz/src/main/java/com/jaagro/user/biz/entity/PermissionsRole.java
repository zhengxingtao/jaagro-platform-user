package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class PermissionsRole {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer roleId;

    /**
     * 
     */
    private Integer permissionId;

    /**
     * 
     */
    private Integer enable;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Integer createUserId;
}