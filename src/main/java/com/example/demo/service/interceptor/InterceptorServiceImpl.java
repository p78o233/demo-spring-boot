package com.example.demo.service.interceptor;/*
 * @author p78o2
 * @date 2019/11/13
 */

import com.example.demo.entity.po.pt.PtPermission;
import com.example.demo.mapper.InterceptorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterceptorServiceImpl implements InterceptorService {
    @Autowired
    private InterceptorMapper interceptorMapper;
//    兼职系统开始
    @Override
    public boolean checkPtAdmin(String token) {
        if(interceptorMapper.checkToken(token)>0)
            return true;
        return false;
    }

    @Override
    public int getPtAdminIdByToken(String token) {
        return interceptorMapper.getPtAdminId(token);
    }

    @Override
    public boolean checkPermission(int userId, String permissionUrl) {
        PtPermission ptPermission = new PtPermission();
        ptPermission = interceptorMapper.getPtPermission(permissionUrl);
        
        return false;
    }

    //    兼职系统结束
}
