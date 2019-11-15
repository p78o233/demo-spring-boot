package com.example.demo.mapper;/*
 * @author p78o2
 * @date 2019/11/13
 */

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface InterceptorMapper {
//    兼职项目开始
//    检查token是否正确
    @Select("select count(*) from pt_admin where token = #{token} and isdel = '0'")
    int checkToken(@Param("token")String token);
//    根据token获取pt-admin 的id
    @Select("select id from pt_admin where token = #{token} and isdel = '0'")
    int getPtAdminId(@Param("token")String token);
//    根据权限url及用户id获取是否有权限
    @Select("select count(*) from pt_permission where id in(select permissionId from pt_role_permission where roleId in (select ptRoleId from pt_admin_role where ptAdminId = #{ptAdminId})) and permissionUrl = #{permissionUrl}")
    int checkAdminPermission(@Param("ptAdminId") int ptAdminId,@Param("permissionUrl")String permissionUrl);
//    兼职项目结束

}
