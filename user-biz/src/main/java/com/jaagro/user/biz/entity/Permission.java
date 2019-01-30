package com.jaagro.user.biz.entity;

import java.util.Date;

public class Permission {
    /**
     * 权限编号
     */
    private String permissionNumber;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 
     */
    private Integer level;

    /**
     * 
     */
    private String parent;

    /**
     * 权限说明
     */
    private String notes;

    /**
     * 是否可用(0 不可用 1 可用)
     */
    private Boolean enabled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Integer modifyUserId;

    /**
     * 
     */
    private String requestUri;

    /**
     * 权限编号
     * @return permission_number 权限编号
     */
    public String getPermissionNumber() {
        return permissionNumber;
    }

    /**
     * 权限编号
     * @param permissionNumber 权限编号
     */
    public void setPermissionNumber(String permissionNumber) {
        this.permissionNumber = permissionNumber == null ? null : permissionNumber.trim();
    }

    /**
     * 权限名称
     * @return permission_name 权限名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 权限名称
     * @param permissionName 权限名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * 
     * @return level 
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     * @param level 
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * @return parent 
     */
    public String getParent() {
        return parent;
    }

    /**
     * 
     * @param parent 
     */
    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    /**
     * 权限说明
     * @return notes 权限说明
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 权限说明
     * @param notes 权限说明
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     * @return create_user_id 创建人
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人
     * @param createUserId 创建人
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 修改人
     * @return modify_user_id 修改人
     */
    public Integer getModifyUserId() {
        return modifyUserId;
    }

    /**
     * 修改人
     * @param modifyUserId 修改人
     */
    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    /**
     * 
     * @return request_uri 
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * 
     * @param requestUri 
     */
    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }
}