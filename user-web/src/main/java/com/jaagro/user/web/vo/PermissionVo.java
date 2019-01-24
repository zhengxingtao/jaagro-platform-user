package com.jaagro.user.web.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author tonyZheng
 * @date 2019-01-24 10:56
 */
@Data
@Accessors(chain = true)
public class PermissionVo implements Serializable {

    private static final long serialVersionUID = 8534719358525835048L;

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
     *
     */
    private String parent;

    /**
     * 权限说明
     */
    private String notes;

    /**
     *
     */
    private String requestUri;
}
