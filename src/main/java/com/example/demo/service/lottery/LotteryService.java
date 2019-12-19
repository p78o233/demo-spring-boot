package com.example.demo.service.lottery;/*
 * @author p78o2
 * @date 2019/12/19
 */

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.po.lottery.LotteryRecord;

import java.util.List;

public interface LotteryService {
//    获取最近某个彩票的开奖记录
    public LotteryRecord getRectResult(int lotteryType);
//    获取某个彩票最近N期出现次数
    public List<JSONObject> getRectTimes(int lotteryType,int issues);
//    获取最近某个彩票最近N期记录
    public List<LotteryRecord> getRectRecord(int lotteryType,int issues);
//    查询某个彩票的某期开奖
    public LotteryRecord getOneIssue(int lotteryType,int issueNumber);
//    新增记录
    public boolean insertLotteryRecord(LotteryRecord lotteryRecord);
}
