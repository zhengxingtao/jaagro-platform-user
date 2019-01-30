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
    private static final long serialVersionUID = -7052374608493077779L;
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer value;
}