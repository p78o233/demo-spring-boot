package com.example.demo.mapper.pt.admin;/*
 * @author p78o2
 * @date 2019/11/12
 */

import com.example.demo.entity.po.pt.PtAdmin;
import com.example.demo.entity.po.pt.PtPermission;
import com.example.demo.entity.po.pt.PtRole;
import com.example.demo.entity.po.pt.PtWorkCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AdminMapper {
//    登陆
    @Select("select count(*) from pt_admin where tel = #{tel} and isdel = '0'")
    int getExistAdmin(@Param("tel") String tel);
    @Select("select count(*) from pt_admin where tel = #{tel} and pwd = #{pwd} and isdel = '0'")
    int getCheckPwd(@Param("tel") String tel, @Param("pwd") String pwd);
    @Update("update pt_admin set token  = #{token} where tel = #{tel} and pwd = #{pwd} and isdel = '0'" )
    int updateAdminToken(@Param("token") String token, @Param("tel") String tel, @Param("pwd") String pwd);
//    修改密码
    @Update("update pt_admin set pwd = #{newPwd} where pwd = #{oldPwd} and id = #{id}")
    int updatePtAdminPwd(@Param("oldPwd") String oldPwd, @Param("newPwd") String newPwd, @Param("id") int id);
//    管理员管理
    @Select("<script>"+"select count(*) from pt_admin where isdel = '0'"+
            "<if test='nickName!=null' >"+
            " and nickName like '%${nickName}%'"+
            "</if>"+
            "</script>")
    int getCountPtAdmin(@Param("nickName") String nickName);
    @Select("<script>"+"select * from pt_admin where isdel = '0'"+
            "<if test='nickName!=null' >"+
            " and nickName like '%${nickName}%'"+
            "</if>"+
            "order by id desc limit #{start},#{perPage}"+
            "</script>")
    List<PtAdmin> getPagePtAdmin(@Param("nickName") String nickName, @Param("start") int start, @Param("perPage") int perPage);
    @Insert("insert into pt_admin (tel,pwd,createTime,createAdmin,nickName) values (#{p.tel},#{p.pwd},#{p.createTime},#{p.createAdmin},#{p.nickName})")
    int insertPtAdmin(@Param("p") PtAdmin ptAdmin);
    @Update("update pt_admin set modifyAdmin = #{p.modifyAdmin},modifyTime = #{p.modifyTime},nickName = #{p.nickName} where id = #{p.id}")
    int updatePtAdmin(@Param("p") PtAdmin ptAdmin);
    @Update("update pt_admin set isdel = '1' modifyAdmin = #{p.modifyAdmin},modifyTime = #{p.modifyTime} where id = #{p.id}")
    int deletePtAdmin(@Param("p") PtAdmin ptAdmin);
//    角色管理
    @Select("select count(*) from pt_role where isdel = '0'")
    int getPtRoleCount();
    @Select("select * from pt_role where isdel = '0' order by id desc limit #{start},#{perPage} ")
    List<PtRole> getPtRolePage(@Param("start") int start, @Param("perPage") int paerPage);
    @Insert("insert into pt_role (roleName,roleCode,createTime,createAdmin) values (#{p.roleName},#{p.roleCode},#{p.createTime},#{p.createAdmin})")
    int insertPtRole(@Param("p") PtRole ptRole);
    @Update("update pt-role set roleName = #{p.roleName},roleCode = #{p.roleCode}," +
            "modifyTime = #{p.modifyTime},modifyAdmin = #{p.modifyAdmin} where id = #{p.id}")
    int updatePtRole(@Param("p") PtRole ptRole);
    @Update("update pt_role set isdel = '1' ,modifyTime = #{modifyTime},modifyAdmin = #{modifyAdmin} where id = #{id}")
    int deletePtRole(@Param("id") int id, @Param("modifyTime") Date modifyTime, @Param("modifyAdmin") int modifyAdmin);
    @Select("<script>"+ "select count(*) from pt_admin where isdel = '0' "+
            "<if test='nickName!=null' >"+
            " and nickName like '%${nickName}%'"+
            "</if>"+
            " and id in (select ptAdminId from pt_admin_role where ptRoleId = #{roleId} and isdel = '0')"+
            "</script>")
    int getAdminByRoleCount(@Param("nickName") String nickName, @Param("roleId") int id);
    @Select("<script>"+ "select * from pt_admin where isdel = '0' "+
            "<if test='nickName!=null' >"+
            " and nickName like '%${nickName}%'"+
            "</if>"+
            " and id in (select ptAdminId from pt_admin_role where ptRoleId = #{roleId} and isdel = '0')"+
            " order by id desc limit #{start},#{perSize}"+
            "</script>")
    List<PtAdmin> getAdminByRolePage(@Param("nickName") String nickName, @Param("roleId") int id, @Param("start") int start, @Param("perSize") int perSize);
//    权限管理
    @Select("select count(*) from pt_permission where id in (select permissionId from pt_role_permission where isdel = '0' and roleId = #{roleId}) and isdel = '0' and parentId = '0'")
    int getPerByRoleCount(@Param("roleId") int roleId);
    @Select("select * from pt_permission where id in (select permissionId from pt_role_permission where isdel = '0' and roleId = #{roleId}) and isdel = '0' and parentId = '0' order by id desc limit #{start},#{perPage}")
    List<PtPermission> getPerByRolePage(@Param("roleId") int roleId, @Param("start") int start, @Param("perPage") int perPage);
    @Select("select count(*) from pt_permission where id in (select permissionId from pt_role_permission where isdel = '0' and roleId = #{roleId}) and isdel = '0' and parentId = #{parentId}")
    int getPerByRoleSecCount(@Param("roleId") int roleId, @Param("parentId") int parentId);
    @Select("select * from pt_permission where id in (select permissionId from pt_role_permission where isdel = '0' and roleId = #{roleId}) and isdel = '0' and parentId = #{parentId} order by id desc limit #{start},#{perPage}")
    List<PtPermission> getPerByRoleSecPage(@Param("roleId") int roleId, @Param("parentId") int parentId, @Param("start") int start, @Param("perPage") int perPage);
    @Select("select count(*) from pt_permission where isdel = '0' and parentId = '0'")
    int getPerCount();
    @Select("select * from pt_permission where isdel = '0' and parentId = '0' order by id desc limit #{start},#{perPage}")
    List<PtPermission> getPerPage(@Param("start") int start, @Param("perPage") int perPage);
    @Select("select * from  pt_permission where isdel = '0' and parentId = #{parentId}")
    List<PtPermission> getPerSecPage(@Param("parentId") int parentId);
    @Insert("insert into pt_permission (permissionName,permissionUrl,parentId,createTime,createAdmin) values (#{p.permissionName}," +
            "#{p.permissionUrl},#{p.parentId},#{p.createTime},#{p.createAdmin})")
    int insertPtPermission(@Param("p") PtPermission ptPermission);
    @Update("update pt_permission set permissionName = #{p.permissionName},permissionUrl = #{p.permissionUrl},parentId = #{p.parentId},modifyTime = #{p.modifyTime},modifyAdmin = #{p.modifyAdmin} where id = #{p.id}")
    int updatePtPermission(@Param("p") PtPermission ptPermission);
    @Update("update pt_permission set isdel = '1' ,modifyTime = #{modifyTime},modifyAdmin = #{modifyAdmin} where id = #{id}")
    int deletePtPermission(@Param("id") int id, @Param("modifyTime") Date modifyTime, @Param("modifyAdmin") int modifyAdmin);
//    工作类别
    @Select("select * from pt_work_category where isdel = '0' and parentId = '0'")
    List<PtWorkCategory> getAllPtWorkCategory();
    @Select("select * from pt_work_category where isdel = '0' and parentId = #{parentId}")
    List<PtWorkCategory> getAllPtWorkCategorySec(@Param("parentId") int parentId);
    @Insert("insert into pt_work_category (categoryName,parentId,createTime,createAdmin) values (#{p.categoryName},#{p.parentId},#{p.parentId}" +
            ",#{p.createTime},#{p.createAdmin})")
    int insertPtWorkCategory(@Param("p") PtWorkCategory ptWorkCategory);
    @Update("update pt_work_category set categoryName = #{p.categoryName},parentId = #{p.parentId},modifyTime = #{p.modifyTime},modifyAdmin = #{p.modifyAdmin} where id  = #{p.id}")
    int updatePtWorkCategory(@Param("p") PtWorkCategory ptWorkCategory);
    @Update("update pt_work_category set isdel = '1' ,modifyTime = #{modifyTime},modifyAdmin = #{modifyAdmin} where id  = #{p.id}")
    int deletePtWorkCategory(@Param("id") int id, @Param("modifyTime") Date modifyTime, @Param("modifyAdmin") int modifyAdmin);

}
