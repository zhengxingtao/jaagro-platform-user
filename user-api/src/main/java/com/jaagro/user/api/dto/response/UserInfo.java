package com.jaagro.user.api.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tony
 */
@Data
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String phoneNumber;

    private String salt;

    private String name;

    private String avatar;

    private Date birthday;

    private String email;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    /**
     * user类型
     */
    private String userType;

    /**
     * 关联id
     */
    private Long relevanceId;
}
