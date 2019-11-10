package com.example.demo.entity.po.pt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "兼职用户工作记录表")
public class PtUserResumeDetail {
    @ApiModelProperty(value = "兼职用户工作记录主键")
    private Integer id;
    @ApiModelProperty(value = "简历id")
    private int ptUserResumeDetailId;
}
