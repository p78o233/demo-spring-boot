package com.example.demo.mapper.lottery;/*
 * @author p78o2
 * @date 2019/12/19
 */

import com.example.demo.entity.po.lottery.LotteryRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LotteryMapper {
    @Select("select * from lottery_record where lotteryType = #{lotteryType} order by issueNumber desc limit 0,#{issue}")
    List<LotteryRecord> getRectResult(@Param("lotteryType")int lotteryType, @Param("issue")int issue);
//    双色球的
    @Select("select count(*) from lottery_record where lotteryType = 1 " +
            "and num1 = #{num} " +
            "or num2 = #{num} " +
            "or num3 = #{num} " +
            "or num4 = #{num} " +
            "or num5 = #{num} " +
            "or num6 = #{num} " +
            "order by issueNumber desc limit 0, #{issues}")
    int getDoubuleFront(@Param("num")int num,@Param("issues")int issues);
    @Select("select count(*) from lottery_record where lotteryType = 1 and num7 = #{num} order by issueNumber desc limit 0, #{issues}")
    int getDoubuleBack(@Param("num")int num,@Param("issues")int issues);
//    大乐透的
    @Select("select count(*) from lottery_record where lotteryType = 2 " +
        "and num1 = #{num} " +
        "or num2 = #{num} " +
        "or num3 = #{num} " +
        "or num4 = #{num} " +
        "or num5 = #{num} " +
        "order by issueNumber desc limit 0, #{issues}" )
    int getLotteryFront(@Param("num")int num,@Param("issues")int issues);
    @Select("select count(*) from lottery_record where lotteryType = 2 and num6 = #{num} or num7 = #{num} order by issueNumber desc limit 0, #{issues}")
    int getLotteryBack(@Param("num")int num,@Param("issues")int issues);
//    3D的
    @Select("select count(*) from lottery_record where lotteryType = 3 and num1 = #{num} order by issueNumber desc limit 0, #{issues}")
    int get3Dnum1(@Param("num")int num,@Param("issues")int issues);
    @Select("select count(*) from lottery_record where lotteryType = 3 and num2 = #{num} order by issueNumber desc limit 0, #{issues}")
    int get3Dnum2(@Param("num")int num,@Param("issues")int issues);
    @Select("select count(*) from lottery_record where lotteryType = 3 and num3 = #{num} order by issueNumber desc limit 0, #{issues}")
    int get3Dnum3(@Param("num")int num,@Param("issues")int issues);

    @Select("select * from lottery_record where lotteryType = #{lotteryType} and issueNumber = #{issueNumber}")
    LotteryRecord getOneIssue(@Param("lotteryType")int lotteryType,@Param("issueNumber")int issueNumber);

    @Insert("insert into lottery_record (lotteryType,num1,num2,num3,num4,num5,num6,num7,issueNumber,createTime,openTime,weekDay) values " +
            "(#{l.lotteryType},#{l.num1},#{l.num1},#{l.num1},#{l.num1},#{l.num1},#{l.num1},#{l.num1},#{l.issueNumber},#{l.createTime},#{l.openTime},#{l.weekDay})")
    int insertLotteryRecord(@Param("l")LotteryRecord lotteryRecord);

}
