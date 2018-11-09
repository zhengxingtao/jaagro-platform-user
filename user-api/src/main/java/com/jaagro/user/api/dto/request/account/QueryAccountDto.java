package com.jaagro.user.api.dto.request.account;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author yj
 * @date 2018/10/25
 */
@Data
@Accessors(chain = true)
public class QueryAccountDto {
    /**
     * 用户id
     */
    @NotNull
    @Min(1)
    private Integer userId;
    /**
     * 用户类型1-客户 2-司机
     */
    @NotNull
    @Min(1)
    private Integer userType;
    /**
     * 账户类型1-现金账户 2-保证金账户
     */
    @NotNull
    @Min(1)
    private Integer accountType;
}
