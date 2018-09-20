package com.jaagro.user.api.dto.response.Employee;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class DeleteEmployeeDto implements Serializable {
    /**
     * 员工表自增
     */
    private Integer id;

    /**
     * 备注
     */
    private String notes;

}
