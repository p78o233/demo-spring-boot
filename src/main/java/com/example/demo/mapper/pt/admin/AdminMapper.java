package com.example.demo.mapper.pt.admin;/*
 * @author p78o2
 * @date 2019/11/12
 */

import com.example.demo.entity.po.pt.PtAdmin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
//    登陆
    @Select("select count(*) from pt_admin where tel = #{tel} and isdel = '0'")
    int getExistAdmin(@Param("tel")String tel);
    @Select("select count(*) from pt_admin where tel = #{tel} and pwd = #{pwd} and isdel = '0'")
    int getCheckPwd(@Param("tel")String tel,@Param("pwd")String pwd);
    @Update("update pt_admin set token  = #{token} where tel = #{tel} and pwd = #{pwd} and isdel = '0'" )
    int updateAdminToken(@Param("token")String token,@Param("tel")String tel,@Param("pwd")String pwd);
//    修改密码
    @Update("update pt_admin set pwd = #{newPwd} where pwd = #{oldPwd} and id = #{id}")
    int updatePtAdminPwd(@Param("oldPwd")String oldPwd,@Param("newPwd")String newPwd,@Param("id")int id);
//    管理员管理
    @Select("<script>"+"select count(*) from pt_admin where isdel = '0'"+
            "<if test='nickName!=null' >"+
            " and nickName like '%${nickName}%'"+
            "</if>"+
            "</script>")
    int getCountPtAdmin(@Param("nickName")String nickName);
    @Select("<script>"+"select * from pt_admin where isdel = '0'"+
            "<if test='nickName!=null' >"+
            " and nickName like '%${nickName}%'"+
            "</if>"+
            "limit #{start},#{perPage}"+
            "</script>")
    List<PtAdmin> getPagePtAdmin(@Param("nickName")String nickName,@Param("start")int start,@Param("perPage")int perPage);
//    @Insert("insert into pe_admin (tel,pwd,createTime)")
}
