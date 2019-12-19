package com.example.demo.service.lottery.impl;/*
 * @author p78o2
 * @date 2019/12/19
 */

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.po.lottery.LotteryRecord;
import com.example.demo.mapper.lottery.LotteryMapper;
import com.example.demo.service.lottery.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class LotteryServiceImpl implements LotteryService {
    @Autowired
    private LotteryMapper lotteryMapper;
    @Override
    public LotteryRecord getRectResult(int lotteryType) {
        return lotteryMapper.getRectResult(lotteryType,1).get(0);
    }

    @Override
    public List<JSONObject> getRectTimes(int lotteryType,int issues) {
        List<JSONObject> list = new ArrayList<JSONObject>();
        switch (lotteryType){
            case 1:{
//                双色球前面
                for(int i = 1;i <= 33;i++){
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("position","front");
                    jsonObject.put("num",i);
                    jsonObject.put("times",lotteryMapper.getDoubuleFront(i,issues));
                    list.add(jsonObject);
                }
                for(int i = 1;i <= 16;i++){
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("position","back");
                    jsonObject.put("num",i);
                    jsonObject.put("times",lotteryMapper.getDoubuleBack(i,issues));
                    list.add(jsonObject);
                }
                break;
            }
            case 2:{
//                大乐透
                for (int i = 1;i <= 35;i++){
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("position","front");
                    jsonObject.put("num",i);
                    jsonObject.put("times",lotteryMapper.getLotteryFront(i,issues));
                    list.add(jsonObject);
                }
                for (int i = 1;i <= 12;i++){
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("position","back");
                    jsonObject.put("num",i);
                    jsonObject.put("times",lotteryMapper.getLotteryBack(i,issues));
                    list.add(jsonObject);
                }
            }
        }
        return list;
    }

    @Override
    public List<LotteryRecord> getRectRecord(int lotteryType, int issues) {
        return lotteryMapper.getRectResult(lotteryType,issues);
    }

    @Override
    public LotteryRecord getOneIssue(int lotteryType, int issueNumber) {
        return lotteryMapper.getOneIssue(lotteryType,issueNumber);
    }

    @Override
    public boolean insertLotteryRecord(LotteryRecord lotteryRecord) {
        lotteryRecord.setCreateTime(new Date());
        if(lotteryMapper.insertLotteryRecord(lotteryRecord)>0)
            return true;
        return false;
    }
}
