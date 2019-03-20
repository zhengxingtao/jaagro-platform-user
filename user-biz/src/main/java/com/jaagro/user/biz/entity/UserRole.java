package com.jaagro.user.biz.entity;

import java.util.Date;

public class UserRole {
    /**
     * 员工角色表ID
     */
    private Integer id;

    /**
     * 员工id
     */
    private Integer userId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 创建人(关联用户ID)
     */
    private Integer createUserId;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 修改人(关联用户ID)
     */
    private Integer modifyUserId;

    /**
     * 修改日期
     */
    private Date modifyTime;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;

    /**
     * 员工角色表ID
     * @return id 员工角色表ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 员工角色表ID
     * @param id 员工角色表ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 员工id
     * @return user_id 员工id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 员工id
     * @param userId 员工id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 角色id
     * @return role_id 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 创建人(关联用户ID)
     * @return create_user_id 创建人(关联用户ID)
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人(关联用户ID)
     * @param createUserId 创建人(关联用户ID)
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 创建日期
     * @return create_time 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建日期
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人(关联用户ID)
     * @return modify_user_id 修改人(关联用户ID)
     */
    public Integer getModifyUserId() {
        return modifyUserId;
    }

    /**
     * 修改人(关联用户ID)
     * @param modifyUserId 修改人(关联用户ID)
     */
    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    /**
     * 修改日期
     * @return modify_time 修改日期
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改日期
     * @param modifyTime 修改日期
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 是否可用(0 不可用 1 可用)
     * @return enabled 是否可用(0 不可用 1 可用)
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 是否可用(0 不可用 1 可用)
     * @param enabled 是否可用(0 不可用 1 可用)
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}