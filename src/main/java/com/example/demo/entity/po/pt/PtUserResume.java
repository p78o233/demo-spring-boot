package com.example.demo.entity.po.pt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "个人简历")
public class PtUserResume {
    @ApiModelProperty(value = "个人简历表主键")
    private Integer id;
    @ApiModelProperty(value = "兼职用户id")
    private int ptUserId;
    @ApiModelProperty(value = "自我描述")
    private String selfDescription;
    @ApiModelProperty(value = "最高学历")
    private String topEduction;

    public PtUserResume() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPtUserId() {
        return ptUserId;
    }

    public void setPtUserId(int ptUserId) {
        this.ptUserId = ptUserId;
    }

    public String getSelfDescription() {
        return selfDescription;
    }

    public void setSelfDescription(String selfDescription) {
        this.selfDescription = selfDescription;
    }

    public String getTopEduction() {
        return topEduction;
    }

    public void setTopEduction(String topEduction) {
        this.topEduction = topEduction;
    }

    public PtUserResume(Integer id, int ptUserId, String selfDescription, String topEduction) {
        this.id = id;
        this.ptUserId = ptUserId;
        this.selfDescription = selfDescription;
        this.topEduction = topEduction;
    }
}
