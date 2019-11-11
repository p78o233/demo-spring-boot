package com.example.demo.service.pt.user;/*
 * @author p78o2
 * @date 2019/11/11
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.pt.PtUser;

public interface PtUserService {
//    登陆
    public R loginPtUser(String tel, String pwd);
//    注册
    public boolean registerPtUser(PtUser ptUser);
//    修改密码
    public boolean updatePtUserPwd(String oldPwd,String newPwd,int id);
}
