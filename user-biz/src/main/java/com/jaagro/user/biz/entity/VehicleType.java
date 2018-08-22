package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author liqiangping
 */
@Data
@Accessors(chain = true)
public class VehicleType implements Serializable {
    /**
     * 车型表主键id
     */
    private Integer id;

    /**
     * 车型名称
     */
    private Integer name;

    /**
     * 车长
     */
    private String vehicleLength;

    /**
     * 车辆承重
     */
    private Float vehicleHeight;

    /**
     * 是否有效
     */
    private Boolean enabled;

}