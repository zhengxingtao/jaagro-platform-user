package com.jaagro.user.api.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tonyZheng
 * @date 2019-03-14 17:00
 */
@Data
@Accessors(chain = true)
public class MenuReturnDto implements Serializable {
    private static final long serialVersionUID = -8983657310215894837L;
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String menuName;

    /**
     *
     */
    private Integer level;

    /**
     *
     */
    private Integer parentId;

    /**
     *
     */
    private String url;

    /**
     *
     */
    private String permissions;

    /**
     *
     */
    private Boolean enable;

    /**
     *
     */
    private Integer sort;

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
}
