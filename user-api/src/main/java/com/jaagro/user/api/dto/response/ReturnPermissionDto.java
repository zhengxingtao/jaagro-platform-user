package com.jaagro.user.api.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class ReturnPermissionDto implements Serializable {
    /**
     * 权限表
     */
    private Integer id;

    /**
     * 权限编号
     */
    private String accessNumber;

    /**
     * 权限说明
     */
    private String accessIllustrate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Long modifyUser;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;
}
