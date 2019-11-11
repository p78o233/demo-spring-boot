package com.example.demo.entity.po.pt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "兼职用户表")
public class PtUser {
    @ApiModelProperty(value = "兼职用户表主键")
    private Integer id;
    @ApiModelProperty(value = "真实姓名")
    private String userName;
    @ApiModelProperty(value = "用户手机号码")
    private String tel;
    @ApiModelProperty(value = "微信号")
    private String wxCode;
    @ApiModelProperty(value = "qqCode")
    private String qqCode;
    @ApiModelProperty(value = "昵称")
    private String nickName;
    @ApiModelProperty(value = "密码")
    private String pwd;
    @ApiModelProperty(value = "令牌token")
    private String token;
    @ApiModelProperty(value = "省")
    private String province;
    @ApiModelProperty(value = "市")
    private String city;
    @ApiModelProperty(value = "区")
    private String area;
    @ApiModelProperty(value = "详细地址")
    private String address;
    @ApiModelProperty(value = "信用分")
    private int score;
    @ApiModelProperty(value = "紧急联系人关系 1 父亲 2母亲 3配偶 4朋友")
    private String emergencyContact;
    @ApiModelProperty(value = "紧急联系人电话")
    private String emergencyTel;
    @ApiModelProperty(value = "身份证号码")
    private String idNum;
    @ApiModelProperty(value = "性别 1男 2 女 3其他")
    private int gender;
    @ApiModelProperty(value = "身份证国徽面")
    private String idCardFront;
    @ApiModelProperty(value = "身份证人像面")
    private String idCardBack;
    @ApiModelProperty(value = "人和身份证人像面一起")
    private String withIdCard;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "是否删除 0正常 1已经删除")
    private boolean isdel;
    public PtUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getQqCode() {
        return qqCode;
    }

    public void setQqCode(String qqCode) {
        this.qqCode = qqCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyTel() {
        return emergencyTel;
    }

    public void setEmergencyTel(String emergencyTel) {
        this.emergencyTel = emergencyTel;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCardFront() {
        return idCardFront;
    }

    public void setIdCardFront(String idCardFront) {
        this.idCardFront = idCardFront;
    }

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
    }

    public String getWithIdCard() {
        return withIdCard;
    }

    public void setWithIdCard(String withIdCard) {
        this.withIdCard = withIdCard;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public PtUser(Integer id, String userName, String tel, String wxCode, String qqCode, String nickName, String pwd, String token, String province, String city, String area, String address, int score, String emergencyContact, String emergencyTel, String idNum, int gender, String idCardFront, String idCardBack, String withIdCard, Date createTime, Date modifyTime, boolean isdel) {
        this.id = id;
        this.userName = userName;
        this.tel = tel;
        this.wxCode = wxCode;
        this.qqCode = qqCode;
        this.nickName = nickName;
        this.pwd = pwd;
        this.token = token;
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.score = score;
        this.emergencyContact = emergencyContact;
        this.emergencyTel = emergencyTel;
        this.idNum = idNum;
        this.gender = gender;
        this.idCardFront = idCardFront;
        this.idCardBack = idCardBack;
        this.withIdCard = withIdCard;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.isdel = isdel;
    }
}
