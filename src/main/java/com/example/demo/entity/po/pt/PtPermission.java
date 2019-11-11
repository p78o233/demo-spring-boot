package com.example.demo.entity.po.pt;/*
 * @author p78o2
 * @date 2019/11/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "权限表")
public class PtPermission {
    @ApiModelProperty(value = "权限表主键")
    private Integer id;
    @ApiModelProperty(value = "权限名称")
    private String permissionName;
    @ApiModelProperty(value = "权限对应的url 有子权限的这个为空")
    private String permissionUrl;
    @ApiModelProperty(value = "父权限id 顶级为0")
    private int parentId;
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
    @ApiModelProperty(value = "角色是否有这个权限，不存数据库")
    private boolean isPermission;

    public PtPermission() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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

    public boolean isPermission() {
        return isPermission;
    }

    public void setPermission(boolean permission) {
        isPermission = permission;
    }

    public PtPermission(Integer id, String permissionName, String permissionUrl, int parentId, Date createTime, int createAdmin, Date modifyTime, int modifyAdmin, boolean isdel, boolean isPermission) {
        this.id = id;
        this.permissionName = permissionName;
        this.permissionUrl = permissionUrl;
        this.parentId = parentId;
        this.createTime = createTime;
        this.createAdmin = createAdmin;
        this.modifyTime = modifyTime;
        this.modifyAdmin = modifyAdmin;
        this.isdel = isdel;
        this.isPermission = isPermission;
    }
}
