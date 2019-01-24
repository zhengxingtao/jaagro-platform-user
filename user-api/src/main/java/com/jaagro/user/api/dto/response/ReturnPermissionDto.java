package com.jaagro.user.api.dto.response;

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
public class ReturnPermissionDto implements Serializable {

    private static final long serialVersionUID = -3861994973197584331L;
    /**
     * 权限编号
     */
    private String permissionNumber;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     *
     */
    private Integer level;

    /**
     * 权限说明
     */
    private String notes;

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
    private Integer createUserId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Integer modifyUserId;

    /**
     *
     */
    private String requestUri;
}
