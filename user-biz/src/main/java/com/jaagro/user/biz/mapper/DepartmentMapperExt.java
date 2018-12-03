package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.request.ListDepartmentCriteriaDto;
import com.jaagro.user.api.dto.response.DepartmentReturnDto;
import com.jaagro.user.api.dto.response.department.ListDepartmentDto;
import org.apache.ibatis.annotations.Param;

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
    List<ListDepartmentDto> listDepartment(@Param("netpoint") Boolean netpoint);

    /**
     * 查询当前用户的本部门及以下的部门列表树
     *
     * @return
     */
    List<ListDepartmentDto> listDepartmentByIds(@Param("deptId") Integer deptId);

    /**
     * 根据父级id查询子列表
     *
     * @param id
     * @return
     */
    List<ListDepartmentDto> listByParentId(@Param("id") Integer id);

    /**
     * 获取下级部门id数组
     *
     * @param id
     * @return
     */
    List<Integer> getDownDepartmentId(@Param("id") Integer id);

    /**
     * 获取所有部门 供其它系统使用
     * @Author gavin 20181203
     * @return
     */
    List<DepartmentReturnDto> getAllDepartments();
}