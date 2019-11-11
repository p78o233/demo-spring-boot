package com.example.demo.entity.po.pt;/*
 * @author p78o2
 * @date 2019/11/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "招聘信息发布人账号表")
public class PtCompanyAdmin {
    @ApiModelProperty(value = "招聘信息发布人账号主键")
    private Integer id;
    @ApiModelProperty(value = "管理员联系电话")
    private String tel;
    @ApiModelProperty(value = "密码")
    private String pwd;
    @ApiModelProperty(value = "令牌")
    private String token;
    @ApiModelProperty(value = "公司id（个人聘用者为0）")
    private int companyId;
    @ApiModelProperty(value = "是否管理员  0 是 1 不是")
    private boolean isAdmin;
    @ApiModelProperty(value = "邀请码（创建账号时系统生成）")
    private String inviteCode;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "给予管理员权限时的人的id（不是管理员就填0）")
    private int createCompanyAdminId;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "修改人id")
    private int modifyUser;
    @ApiModelProperty(value = "是否个人聘用者（0不是  1是）")
    private boolean isPersonal;
    @ApiModelProperty(value = "是否删除 0正常 1已经删除")
    private boolean isdel;

    public PtCompanyAdmin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCreateCompanyAdminId() {
        return createCompanyAdminId;
    }

    public void setCreateCompanyAdminId(int createCompanyAdminId) {
        this.createCompanyAdminId = createCompanyAdminId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(int modifyUser) {
        this.modifyUser = modifyUser;
    }

    public boolean isPersonal() {
        return isPersonal;
    }

    public void setPersonal(boolean personal) {
        isPersonal = personal;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public PtCompanyAdmin(Integer id, String tel, String pwd, String token, int companyId, boolean isAdmin, String inviteCode, Date createTime, int createCompanyAdminId, Date modifyTime, int modifyUser, boolean isPersonal, boolean isdel) {
        this.id = id;
        this.tel = tel;
        this.pwd = pwd;
        this.token = token;
        this.companyId = companyId;
        this.isAdmin = isAdmin;
        this.inviteCode = inviteCode;
        this.createTime = createTime;
        this.createCompanyAdminId = createCompanyAdminId;
        this.modifyTime = modifyTime;
        this.modifyUser = modifyUser;
        this.isPersonal = isPersonal;
        this.isdel = isdel;
    }
}
