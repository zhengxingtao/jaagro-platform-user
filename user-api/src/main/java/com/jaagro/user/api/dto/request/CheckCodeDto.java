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
     * 电话
     */
    private String phone;

    /**
     * 验证码
     */
    private String verificationCode;

    /**
     * oldPassword
     */
    private String oldPassword;

    /**
     * newPassword
     */
    private String newPassword;


}