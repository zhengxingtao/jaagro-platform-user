package com.jaagro.user.biz.mapper;

import com.jaagro.user.biz.entity.BusinessSupport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tony
 */
public interface BusinessSupportMapperExt extends BusinessSupportMapper {
    /**
     * 根据网点获取专管列表
     * @param employeeId
     * @return
     */
    List<BusinessSupport> listBusinessSupportByEmpId(@Param("employeeId") Integer employeeId);
}