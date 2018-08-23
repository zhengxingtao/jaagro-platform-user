package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.response.DepartmentReturnDto;
import com.jaagro.user.biz.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    /**
     *
     * @mbggenerated 2018-08-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insert(Department record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int insertSelective(Department record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    Department selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     *
     * @mbggenerated 2018-08-22
     */
    int updateByPrimaryKey(Department record);

    /**
     * 查询单个部门Dto
     *
     * @param id
     * @return
     */
    DepartmentReturnDto getById(Integer id);

    /**
     * 分页查询
     *
     * @param dto
     * @return
     */
    List<DepartmentReturnDto> getByCriteriDto(ListDepartmentCriteriaDto dto);
}