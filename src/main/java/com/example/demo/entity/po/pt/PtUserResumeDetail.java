package com.example.demo.entity.po.pt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "兼职用户工作记录表")
public class PtUserResumeDetail {
    @ApiModelProperty(value = "兼职用户工作记录主键")
    private Integer id;
    @ApiModelProperty(value = "简历id")
    private int ptUserResumeDetailId;
    @ApiModelProperty(value = "发布工作的公司的id")
    private int companyId;
    @ApiModelProperty(value = "工作id")
    private int workId;
    @ApiModelProperty(value = "工作职责")
    private String duty;
    @ApiModelProperty(value = "聘用者对被聘用者评分")
    private int evaluate;
    @ApiModelProperty(value = "聘用者对被聘用者文字评价")
    private String evaluateText;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "聘用者评价时间")
    private Date evaluateTime;
    @ApiModelProperty(value = "完成时间")
    private Date finishTime;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "被聘用者对工作评分")
    private int reEvaluateForWork;
    @ApiModelProperty(value = "被聘用者对工作文字评价")
    private String reEvaluateTextForWork;
    @ApiModelProperty(value = "是否删除 0正常 1已经删除")
    private boolean isdel;
    @ApiModelProperty(value = "被聘用者对工作发布者评分")
    private int reEvaluateForAdmin;
    @ApiModelProperty(value = "被聘用者对工作发布者文字评价")
    private String reEvaluateTextForAdmin;

    public PtUserResumeDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPtUserResumeDetailId() {
        return ptUserResumeDetailId;
    }

    public void setPtUserResumeDetailId(int ptUserResumeDetailId) {
        this.ptUserResumeDetailId = ptUserResumeDetailId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(int evaluate) {
        this.evaluate = evaluate;
    }

    public String getEvaluateText() {
        return evaluateText;
    }

    public void setEvaluateText(String evaluateText) {
        this.evaluateText = evaluateText;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
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

    public int getReEvaluateForWork() {
        return reEvaluateForWork;
    }

    public void setReEvaluateForWork(int reEvaluateForWork) {
        this.reEvaluateForWork = reEvaluateForWork;
    }

    public String getReEvaluateTextForWork() {
        return reEvaluateTextForWork;
    }

    public void setReEvaluateTextForWork(String reEvaluateTextForWork) {
        this.reEvaluateTextForWork = reEvaluateTextForWork;
    }

    public int getReEvaluateForAdmin() {
        return reEvaluateForAdmin;
    }

    public void setReEvaluateForAdmin(int reEvaluateForAdmin) {
        this.reEvaluateForAdmin = reEvaluateForAdmin;
    }

    public String getReEvaluateTextForAdmin() {
        return reEvaluateTextForAdmin;
    }

    public void setReEvaluateTextForAdmin(String reEvaluateTextForAdmin) {
        this.reEvaluateTextForAdmin = reEvaluateTextForAdmin;
    }

    public PtUserResumeDetail(Integer id, int ptUserResumeDetailId, int companyId, int workId, String duty, int evaluate, String evaluateText, Date createTime, Date evaluateTime, Date finishTime, Date modifyTime, int reEvaluateForWork, String reEvaluateTextForWork, boolean isdel, int reEvaluateForAdmin, String reEvaluateTextForAdmin) {
        this.id = id;
        this.ptUserResumeDetailId = ptUserResumeDetailId;
        this.companyId = companyId;
        this.workId = workId;
        this.duty = duty;
        this.evaluate = evaluate;
        this.evaluateText = evaluateText;
        this.createTime = createTime;
        this.evaluateTime = evaluateTime;
        this.finishTime = finishTime;
        this.modifyTime = modifyTime;
        this.reEvaluateForWork = reEvaluateForWork;
        this.reEvaluateTextForWork = reEvaluateTextForWork;
        this.isdel = isdel;
        this.reEvaluateForAdmin = reEvaluateForAdmin;
        this.reEvaluateTextForAdmin = reEvaluateTextForAdmin;
    }
}
