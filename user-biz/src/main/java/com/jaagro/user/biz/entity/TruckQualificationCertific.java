package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class TruckQualificationCertific implements Serializable {
    /**
     * 资质证照主键id
     */
    private Long id;

    /**
     * 关联车辆表
     */
    private Long vehicleId;

    /**
     * 证件类型(1-工商执照 2-身份证正面 3-身份证反面 4-......)
     */
    private Integer certificateType;

    /**
     * 创建人(关联用户ID)
     */
    private Long createUserId;

    /**
     * 修改人(关联用户ID)
     */
    private Long modifyUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 证件图片地址
     */
    private String certificateImageUrl;

    /**
     * 证件状态(0-未审核。1-正常 2-审核未通过审核 4-不可用)
     */
    private Integer certificateStatus;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 是否可用(0不可用 1可用)
     */
    private Boolean enabled;

    /**
     * 资质类型(1 司机 2 车辆 3 车队)
     */
    private Integer certificType;

    /**
     * 关联类型(1 关联司机ID 2 关联车辆ID 3 关联车队ID)
     */
    private Long referencesId;

}