package com.example.demo.controller.lottery;/*
 * @author p78o2
 * @date 2019/12/19
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.lottery.LotteryRecord;
import com.example.demo.service.lottery.LotteryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lottery/lottery-admin/index")
@Api(value = "彩票模块")
public class LotteryController {
    @Autowired
    private LotteryService lotteryService;

    @ApiOperation(value = "获取最近某个彩票的开奖记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="lotteryType",value = "类型 1双 2大",dataType = "int",paramType = "query")
    })
    @GetMapping(value = "/getRectResult")
    public R getRectResult(@RequestParam int lotteryType){
        return new R(true,200,lotteryService.getRectResult(lotteryType),"查询成功");
    }

    @ApiOperation(value = "获取某个彩票最近N期出现次数")
    @ApiImplicitParams({
            @ApiImplicitParam(name="lotteryType",value = "类型 1双 2大",dataType = "int",paramType = "query"),
            @ApiImplicitParam(name="issues",value = "期数",dataType = "int",paramType = "query"),
    })
    @GetMapping(value = "/getRectTimes")
    public R getRectTimes(@RequestParam int lotteryType,@RequestParam int issues){
        return new R(true,200,lotteryService.getRectTimes(lotteryType,issues),"查询成功");
    }
    @ApiOperation(value = "获取最近某个彩票最近N期记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="lotteryType",value = "类型 1双 2大",dataType = "int",paramType = "query"),
            @ApiImplicitParam(name="issues",value = "期数",dataType = "int",paramType = "query"),
    })
    @GetMapping(value = "/getRectRecord")
    public R getRectRecord(@RequestParam int lotteryType,@RequestParam int issues){
        return new R(true,200,lotteryService.getRectRecord(lotteryType,issues),"查询成功");
    }
    @ApiOperation(value = "查询某个彩票的某期开奖")
    @ApiImplicitParams({
            @ApiImplicitParam(name="lotteryType",value = "类型 1双 2大",dataType = "int",paramType = "query"),
            @ApiImplicitParam(name="issueNumber",value = "期号",dataType = "int",paramType = "query"),
    })
    @GetMapping(value = "/getOneIssue")
    public R getOneIssue(@RequestParam int lotteryType,@RequestParam int issueNumber){
        return new R(true,200,lotteryService.getOneIssue(lotteryType,issueNumber),"查询成功");
    }
    @ApiOperation(value = "新增记录")
    @PostMapping(value = "/insertLotteryRecord")
    private R insertLotteryRecord(@RequestBody LotteryRecord lotteryRecord){
        if(lotteryService.insertLotteryRecord(lotteryRecord))
            return new R(true,200,true,"操作成功");
        return new R(false,500,false,"操作失败");
    }
}
