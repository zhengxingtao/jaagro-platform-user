package com.jaagro.user.biz.mapper;

import com.jaagro.user.api.dto.request.ListRoleCriteriaDto;
import com.jaagro.user.api.dto.request.UpdateRoleDto;
import com.jaagro.user.api.dto.response.GetRoleDto;
import com.jaagro.user.api.dto.response.ReturnRoleDto;
import com.jaagro.user.api.dto.response.RoleReturnDto;
import com.jaagro.user.biz.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author baiyiran
 */
public interface RoleMapperExt extends RoleMapper {

    /**
     * 查询全部角色
     *
     * @return
     */
    List<Role> listAll();

    /**
     * 查询全部角色
     *
     * @return
     */
    List<Role> listByCriteria(ListRoleCriteriaDto roleCriteriaDto);

    /**
     * 根据名称查询
     *
     * @param roleDto
     * @return
     */
    Role getByName(UpdateRoleDto roleDto);

    /**
     * 单个查询角色[含角色权限]
     *
     * @param id
     * @return
     */
    ReturnRoleDto getRoleDetailById(Integer id);

    /**
     * 目前只考虑到userId对象才会有权限，如果后期其他用户对象也需要权限，请认真梳理这里的代码
     * @param userId
     * @return
     */
    List<RoleReturnDto> listRoleByUserId(@Param("userId") int userId);

}