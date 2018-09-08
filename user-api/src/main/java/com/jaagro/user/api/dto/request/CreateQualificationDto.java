package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class CreateQualificationDto implements Serializable {

    /**
     * 关联车队表
     */
    private Integer truckTeamId;

    /**
     * 关联车辆表
     */
    private Integer truckId;

    /**
     * 所属驾驶员ID
     */
    private Integer driverId;

    /**
     * 资质类型(1-工商执照 2-身份证正面 3-身份证反面 4-......)
     */
    private Integer certificateType;

    /**
     * 证件图片地址
     */
    private String certificateImageUrl;

    /**
     * 证件状态(0；审核未通过 1；未审核 2；已审核)
     */
    private Integer certificateStatus;

    /**
     * 描述信息
     */
    private String notes;
}
