package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Permissions implements Serializable {
    private static final long serialVersionUID = 7823122204238586710L;
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