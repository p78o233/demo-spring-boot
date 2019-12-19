package com.example.demo.entity.po.lottery;/*
 * @author p78o2
 * @date 2019/12/19
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel(value = "开奖信息记录表")
public class LotteryRecord {
    @ApiModelProperty(value = "开奖信息记录表主键")
    private Integer id;
    @ApiModelProperty(value = "彩票类型 1双 2大")
    private int lotteryType;
    @ApiModelProperty(value = "第1个数字")
    private int num1;
    @ApiModelProperty(value = "第2个数字")
    private int num2;
    @ApiModelProperty(value = "第3个数字")
    private int num3;
    @ApiModelProperty(value = "第4个数字")
    private int num4;
    @ApiModelProperty(value = "第5个数字")
    private int num5;
    @ApiModelProperty(value = "第6个数字")
    private int num6;
    @ApiModelProperty(value = "第7个数字")
    private int num7;
    @ApiModelProperty(value = "期号")
    private int issueNumber;
    @ApiModelProperty(value = "创建日期")
    private Date createTime;
    @ApiModelProperty(value = "开奖日期")
    private Date openTime;
    @ApiModelProperty(value = "星期几")
    private int weekDay;
    public LotteryRecord() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(int lotteryType) {
        this.lotteryType = lotteryType;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public int getNum7() {
        return num7;
    }

    public void setNum7(int num7) {
        this.num7 = num7;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public LotteryRecord(Integer id, int lotteryType, int num1, int num2, int num3, int num4, int num5, int num6, int num7, int issueNumber, Date createTime, Date openTime, int weekDay) {
        this.id = id;
        this.lotteryType = lotteryType;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
        this.num7 = num7;
        this.issueNumber = issueNumber;
        this.createTime = createTime;
        this.openTime = openTime;
        this.weekDay = weekDay;
    }
}
