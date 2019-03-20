package com.jaagro.user.api.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tonyZheng
 * @date 2019-03-14 17:15
 */
@Data
@Accessors(chain = true)
public class RoleReturnDto implements Serializable {
    private static final long serialVersionUID = -793737589334183442L;

    /**
     * 角色表主键
     */
    private Integer id;

    /**
     * 角色名(管理员)
     */
    private String name;

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
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Integer modifyUserId;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;
}
