package com.example.demo.entity.po.pt;/*
 * @author p78o2
 * @date 2019/11/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "角色-权限表")
public class PtRolePermission {
    @ApiModelProperty(value = "角色-权限主键")
    private Integer id;
    @ApiModelProperty(value = "角色id")
    private int roleId;
    @ApiModelProperty(value = "权限id")
    private int permissionId;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "创建人")
    private int createAdmin;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "修改人")
    private int modifyAdmin;
    @ApiModelProperty(value = "是否删除了0正常 1删除")
    private boolean isdel;

    public PtRolePermission() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCreateAdmin() {
        return createAdmin;
    }

    public void setCreateAdmin(int createAdmin) {
        this.createAdmin = createAdmin;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getModifyAdmin() {
        return modifyAdmin;
    }

    public void setModifyAdmin(int modifyAdmin) {
        this.modifyAdmin = modifyAdmin;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public PtRolePermission(Integer id, int roleId, int permissionId, Date createTime, int createAdmin, Date modifyTime, int modifyAdmin, boolean isdel) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.createTime = createTime;
        this.createAdmin = createAdmin;
        this.modifyTime = modifyTime;
        this.modifyAdmin = modifyAdmin;
        this.isdel = isdel;
    }
}
