package com.jaagro.user.biz.mapper;

/**
 * @author tony
 */
public interface IdGeneratorMapperExt extends IdGeneratorMapper {

    /**
     * id自增
     *
     * @return
     */
    int getNextId();
}