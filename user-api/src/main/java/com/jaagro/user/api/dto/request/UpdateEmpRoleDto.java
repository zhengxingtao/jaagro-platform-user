package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class UpdateEmpRoleDto implements Serializable {
    /**
     * 员工角色表ID
     */
    private Integer id;

    /**
     * 员工id
     */
    private Integer employeeId;

    /**
     * 角色id
     */
    private Integer roleId;

}
