package com.example.demo.mapper.pt.user;/*
 * @author p78o2
 * @date 2019/11/11
 */

import com.example.demo.entity.po.pt.PtUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface PtUserMapper {
//    登陆
    @Select("select count(*) from pt_user where tel = #{tel} and isdel = '0'")
    int getIsExistUser(@Param("tel")String tel);
    @Select("select * from pt_user where tel = #{tel} and pwd = #{pwd} and isdel = '0'")
    PtUser getCheckPtUserPwd(@Param("tel")String tel,@Param("pwd")String pwd);
    @Update("update pt_user set token = #{token} where tel = #{tel} and pwd = #{pwd} and isdel = '0'")
    int updatePtUserToken(@Param("token")String token,@Param("tel")String tel,@Param("pwd")String pwd);
//    注册
    @Insert("insert into pt_user (userName,tel,wxCode,qqCode,nickName,pwd,province,city,area,address,emergencyContact" +
            ",emergencyTel,idNum,gender,idCardFront,idCardBack,withIdCard,createTime) values" +
            "(#{p.userName},#{p.tel},#{p.wxCode},#{p.qqCode},#{p.nickName},#{p.pwd},#{p.province},#{p.city}," +
            "#{p.area},#{p.address},#{p.emergencyContact},#{p.emergencyTel},#{p.idNum},#{p.gender},#{p.idCardFront}," +
            "#{p.idCardBack},#{p.withIdCard},#{p.createTime})")
    int insertPtUser(@Param("p")PtUser ptUser);
    @Select("select count(*) from pt_user where tel = #{tel} and isdel = '0'")
    int getExistTel(@Param("tel")String tel);
//    修改密码
    @Update("update pt_user set pwd = #{newPwd} where id = #{id} and pwd = #{oldPwd}")
    int updatePtUserPwd(@Param("newPwd")String newPwd,@Param("oldPwd")String oldPwd,@Param("id")int id);
}
