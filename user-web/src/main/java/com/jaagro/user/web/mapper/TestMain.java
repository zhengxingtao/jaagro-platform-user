package com.jaagro.user.web.mapper;

import com.jaagro.user.api.dto.response.ReturnPermissionDto;
import com.jaagro.user.web.vo.PermissionVo;

/**
 * @author tonyZheng
 * @date 2019-01-24 13:29
 */
public class TestMain {

    public static void main(String[] args) {

        ReturnPermissionDto returnPermissionDto = new ReturnPermissionDto();
        returnPermissionDto.setLevel(1);
        System.out.println(returnPermissionDto);

        //copy

        PermissionVo permissionVo = new PermissionVo();

        permissionVo = DtoToVoUtils.INSTANCE.toPermissionVo(returnPermissionDto);
        System.out.println(permissionVo);
    }
}
