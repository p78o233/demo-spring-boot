package com.example.demo.entity.po.pt;/*
 * @author p78o2
 * @date 2019/11/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "兼职系统管理员账号表")
public class PtAdmin {
    @ApiModelProperty(value = "兼职系统管理员账号主键")
    private Integer id;
    @ApiModelProperty(value = "手机号码")
    private String tel;
    @ApiModelProperty(value = "密码")
    private String pwd;
    @ApiModelProperty(value = "令牌")
    private String token;
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
    @ApiModelProperty(value = "昵称")
    private String nickName;

    public PtAdmin() {
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public PtAdmin(Integer id, String tel, String pwd, String token, Date createTime, int createAdmin, Date modifyTime, int modifyAdmin, boolean isdel, String nickName) {
        this.id = id;
        this.tel = tel;
        this.pwd = pwd;
        this.token = token;
        this.createTime = createTime;
        this.createAdmin = createAdmin;
        this.modifyTime = modifyTime;
        this.modifyAdmin = modifyAdmin;
        this.isdel = isdel;
        this.nickName = nickName;
    }
}
