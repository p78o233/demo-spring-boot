package com.example.demo.entity.po.pt;/*
 * @author p78o2
 * @date 2019/11/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "发布的工作")
public class PtWork {
    @ApiModelProperty(value = "发布的工作主键")
    private Integer id;
    @ApiModelProperty(value = "")
    private String workDuty;
    @ApiModelProperty(value = "结算方式 1、日结 2、周结 3、月结 4、工作完成后结")
    private int settlementMethod;
    @ApiModelProperty(value = "要求")
    private String requirement;
    @ApiModelProperty(value = "性别要求 1、男 2、 女 3、不限")
    private int gender;
    @ApiModelProperty(value = "总共招收报名人数")
    private int  totalNumber;
    @ApiModelProperty(value = "当前报名人数")
    private int currentNumber;
    @ApiModelProperty(value = "招聘开始时间")
    private Date beginTime;
    @ApiModelProperty(value = "招聘结束时间")
    private Date endTime;
    @ApiModelProperty(value = "每日的工作开始时间")
    private Date workBeginTime;
    @ApiModelProperty(value = "每日工作结束时间")
    private Date workEndTime;
    @ApiModelProperty(value = "招聘信息标题")
    private String title;
    @ApiModelProperty(value = "单价/元")
    private float unitPrice;
    @ApiModelProperty(value = "单价的单位  小时  天  周  月  整个工作")
    private String unitLength;
    @ApiModelProperty(value = "工作开始时间（长期有效的不用填）")
    private Date startTime;
    @ApiModelProperty(value = "工作结束时间（长期有效的不用填）")
    private Date finishTime;
    @ApiModelProperty(value = "是否长期有效 0不是 1是")
    private boolean isLongTerm;
    @ApiModelProperty(value = "发布公司id（个人发布者为0）")
    private int companyId;
    @ApiModelProperty(value = "工作发布者id")
    private int createCompanyAdminId;
    @ApiModelProperty(value = "工作详细地址")
    private String workPlace;
    @ApiModelProperty(value = "是否到指定工作场所 0不是 1 是")
    private boolean isFixed;
    @ApiModelProperty(value = "工作地址经度")
    private double longitude;
    @ApiModelProperty(value = "工作地址纬度")
    private double latitude;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "修改人id")
    private int modifyCompanyAdminId;
    @ApiModelProperty(value = "是否过期 0没过期 1过期")
    private boolean isOverdue;
    @ApiModelProperty(value = "是否删除 0正常 1已经删除")
    private boolean isdel;
    @ApiModelProperty(value = "类别id")
    private int workCategoryId;

    public PtWork() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkDuty() {
        return workDuty;
    }

    public void setWorkDuty(String workDuty) {
        this.workDuty = workDuty;
    }

    public int getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(int settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getWorkBeginTime() {
        return workBeginTime;
    }

    public void setWorkBeginTime(Date workBeginTime) {
        this.workBeginTime = workBeginTime;
    }

    public Date getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(Date workEndTime) {
        this.workEndTime = workEndTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnitLength() {
        return unitLength;
    }

    public void setUnitLength(String unitLength) {
        this.unitLength = unitLength;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public boolean isLongTerm() {
        return isLongTerm;
    }

    public void setLongTerm(boolean longTerm) {
        isLongTerm = longTerm;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCreateCompanyAdminId() {
        return createCompanyAdminId;
    }

    public void setCreateCompanyAdminId(int createCompanyAdminId) {
        this.createCompanyAdminId = createCompanyAdminId;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
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

    public int getModifyCompanyAdminId() {
        return modifyCompanyAdminId;
    }

    public void setModifyCompanyAdminId(int modifyCompanyAdminId) {
        this.modifyCompanyAdminId = modifyCompanyAdminId;
    }

    public boolean isOverdue() {
        return isOverdue;
    }

    public void setOverdue(boolean overdue) {
        isOverdue = overdue;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public int getWorkCategoryId() {
        return workCategoryId;
    }

    public void setWorkCategoryId(int workCategoryId) {
        this.workCategoryId = workCategoryId;
    }

    public PtWork(Integer id, String workDuty, int settlementMethod, String requirement, int gender, int totalNumber, int currentNumber, Date beginTime, Date endTime, Date workBeginTime, Date workEndTime, String title, float unitPrice, String unitLength, Date startTime, Date finishTime, boolean isLongTerm, int companyId, int createCompanyAdminId, String workPlace, boolean isFixed, double longitude, double latitude, Date createTime, Date modifyTime, int modifyCompanyAdminId, boolean isOverdue, boolean isdel, int workCategoryId) {
        this.id = id;
        this.workDuty = workDuty;
        this.settlementMethod = settlementMethod;
        this.requirement = requirement;
        this.gender = gender;
        this.totalNumber = totalNumber;
        this.currentNumber = currentNumber;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.workBeginTime = workBeginTime;
        this.workEndTime = workEndTime;
        this.title = title;
        this.unitPrice = unitPrice;
        this.unitLength = unitLength;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.isLongTerm = isLongTerm;
        this.companyId = companyId;
        this.createCompanyAdminId = createCompanyAdminId;
        this.workPlace = workPlace;
        this.isFixed = isFixed;
        this.longitude = longitude;
        this.latitude = latitude;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.modifyCompanyAdminId = modifyCompanyAdminId;
        this.isOverdue = isOverdue;
        this.isdel = isdel;
        this.workCategoryId = workCategoryId;
    }
}
