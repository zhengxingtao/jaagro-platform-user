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
public class GetRoleDto implements Serializable {
    /**
     * 角色表主键
     */
    private Integer id;

    /**
     * 角色名(管理员)
     */
    private String name;
}
