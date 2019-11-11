package com.example.demo.entity.po.pt;/*
 * @author p78o2
 * @date 2019/11/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "公司表")
public class PtCompany {
    @ApiModelProperty(value = "公司表主键")
    private Integer id;
    @ApiModelProperty(value = "公司名字")
    private String companyName;
    @ApiModelProperty(value = "联系人姓名")
    private String contactName;
    @ApiModelProperty(value = "联系电话手机")
    private String contactPhone;
    @ApiModelProperty(value = "联系电话座机")
    private String contactTel;
    @ApiModelProperty(value = "营业执照")
    private String licenseImg;
    @ApiModelProperty(value = "address")
    private String address;
    @ApiModelProperty(value = "是否删除 0正常 1已经删除")
    private boolean isdel;

    public PtCompany() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getLicenseImg() {
        return licenseImg;
    }

    public void setLicenseImg(String licenseImg) {
        this.licenseImg = licenseImg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public PtCompany(Integer id, String companyName, String contactName, String contactPhone, String contactTel, String licenseImg, String address, boolean isdel) {
        this.id = id;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactTel = contactTel;
        this.licenseImg = licenseImg;
        this.address = address;
        this.isdel = isdel;
    }
}
