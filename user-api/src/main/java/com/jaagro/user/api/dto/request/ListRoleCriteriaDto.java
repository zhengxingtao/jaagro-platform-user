package com.jaagro.user.api.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author baiyiran
 */
@Data
@Accessors(chain = true)
public class ListRoleCriteriaDto {

    /**
     * 起始页
     */
    private Integer pageNum;


    /**
     * 每页条数
     */
    private Integer pageSize;

}
