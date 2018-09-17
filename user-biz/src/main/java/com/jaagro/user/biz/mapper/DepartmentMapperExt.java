package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.response.DepartmentReturnDto;
import com.jaagro.user.api.dto.response.department.ListDepartmentDto;
import com.jaagro.user.api.dto.response.department.ListDepartmentSonDto;

import java.util.List;

/**
 * @author tony
 */
public interface DepartmentMapperExt extends DepartmentMapper {

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

    /**
     * 查询部门列表树
     *
     * @return
     */
    List<ListDepartmentDto> listDepartment();

    /**
     * 根据父级id查询子列表
     *
     * @param parentId
     * @return
     */
    List<ListDepartmentSonDto> listByParentId(Integer parentId);
}