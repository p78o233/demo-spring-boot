package com.example.demo.service.interceptor;/*
 * @author p78o2
 * @date 2019/11/13
 */

public interface InterceptorService {
//    检查pt-admin toknen是否过期
    public boolean checkPtAdmin(String token);
//    根据token 获取pt-admin的id
    public int getPtAdminIdByToken(String token);
//    鉴权查看用户是否有权限调用接口
    public boolean checkPermission(int userId,String permissionUrl);
}
