package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class CreateTruckContractDto implements Serializable {
    /**
     * 主键车队表联系人ID
     */
    private Long id;

    /**
     * 关联车队表ID
     */
    private Long truckId;

    /**
     * 联系人员
     */
    private String contractName;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 传真号码
     */
    private String faxNumber;

}
