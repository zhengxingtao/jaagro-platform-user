package com.jaagro.user.api.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 重构后的权限对象
 * @author tonyZheng
 * @date 2019-03-19 11:35
 */
@Data
@Accessors(chain = true)
public class ReturnPermissionsDto implements Serializable {
    private static final long serialVersionUID = 7234958419312552726L;
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String permissionsNo;

    /**
     *
     */
    private String permissionsName;

    /**
     *
     */
    private Integer parentId;

    /**
     * 描述
     */
    private String notes;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enable;
}
