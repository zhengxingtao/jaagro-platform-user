package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class CheckCodeDto implements Serializable {
    /**
     * 部门名称
     */
    private String phone;

    /**
     * 上级部门id
     */
    private String verificationCode;

}
