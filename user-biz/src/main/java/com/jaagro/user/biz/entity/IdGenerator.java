package com.jaagro.user.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author tony
 */
@Data
@Accessors(chain = true)
public class IdGenerator implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer value;
}