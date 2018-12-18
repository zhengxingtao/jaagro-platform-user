package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author tony
 */
@Data
@Accessors(chain = true)
public class UpdateDriverDto implements Serializable {
    /**
     * 司机id
     */
    private Integer id;

    /**
     * 关联车队表ID
     */
    private Integer truckTeamId;

    /**
     * 关联车辆ID
     */
    private Integer truckId;

    /**
     * 司机姓名
     */
    private String name;

    /**
     * 驾照类型
     */
    private Integer drivingLicense;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 驾驶证到期时间
     */
    private String expiryDrivingLicense;

    /**
     * JPush时司机的设备注册id
     */
    private String registrationId;
}
