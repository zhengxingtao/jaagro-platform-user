package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.request.department.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.response.department.DepartmentReturnDto;
import com.jaagro.user.biz.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    /**
     *
     * @mbggenerated 2018-08-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insert(Department record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int insertSelective(Department record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    Department selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     *
     * @mbggenerated 2018-08-18
     */
    int updateByPrimaryKey(Department record);

    /**
     * 查询单个部门Dto
     *
     * @param id
     * @return
     */
    DepartmentReturnDto getById(Long id);

    /**
     * 分页查询
     *
     * @param dto
     * @return
     */
    List<DepartmentReturnDto> getByCriteriDto(ListDepartmentCriteriaDto dto);
}