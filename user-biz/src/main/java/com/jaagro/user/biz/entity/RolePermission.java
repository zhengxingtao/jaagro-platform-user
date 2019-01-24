package com.jaagro.user.biz.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * @author tony
 */
@Data
public class RolePermission implements Serializable {

    private static final long serialVersionUID = -565329361210098173L;
    /**
     * 角色权限表
     */
    private Integer id;

    /**
     * 关联角色ID
     */
    private Integer roleId;

    /**
     * 关联权限ID
     */
    private String permissionId;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createUserId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Long modifyUserId;
}