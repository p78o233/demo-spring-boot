package com.example.demo.entity.po.pt;/*
 * @author p78o2
 * @date 2019/11/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "工作类别")
public class PtWorkCategory {
    @ApiModelProperty(value = "工作类别表主键")
    private Integer id;
    @ApiModelProperty(value = "类别名称")
    private String categoryName;
    @ApiModelProperty(value = "是否删除 0正常 1 删除")
    private boolean isdel;
    @ApiModelProperty(value = "父分类id，顶级为0")
    private int parentId;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "创建人")
    private int createAdmin;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "修改人")
    private int modifyAdmin;

    public PtWorkCategory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
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

    public PtWorkCategory(Integer id, String categoryName, boolean isdel, int parentId, Date createTime, int createAdmin, Date modifyTime, int modifyAdmin) {
        this.id = id;
        this.categoryName = categoryName;
        this.isdel = isdel;
        this.parentId = parentId;
        this.createTime = createTime;
        this.createAdmin = createAdmin;
        this.modifyTime = modifyTime;
        this.modifyAdmin = modifyAdmin;
    }
}
