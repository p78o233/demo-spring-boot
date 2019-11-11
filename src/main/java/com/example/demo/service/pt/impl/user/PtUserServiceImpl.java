package com.example.demo.service.pt.impl.user;/*
 * @author p78o2
 * @date 2019/11/11
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.pt.PtUser;
import com.example.demo.mapper.pt.user.PtUserMapper;
import com.example.demo.service.pt.user.PtUserService;
import com.example.demo.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PtUserServiceImpl implements PtUserService {
    @Autowired
    private PtUserMapper ptUserMapper;
    @Override
    public R loginPtUser(String tel, String pwd) {
        if(ptUserMapper.getIsExistUser(tel)>0){
            if(ptUserMapper.getCheckPtUserPwd(tel,Utils.makeMD5(pwd))!=null){
                String token = Utils.makeMD5(tel+pwd+String.valueOf(new Date().getTime()));
                if(ptUserMapper.updatePtUserToken(token,tel,Utils.makeMD5(pwd))>0){
                    return new R(true,200,token,"登陆成功");
                }else{
                    return new R(false,503,null,"登陆失败");
                }
            }else{
                return new R(false,502,null,"密码错误");
            }
        }else{
            return new R(false,501,null,"账号不存在");
        }
    }

    @Override
    public boolean registerPtUser(PtUser ptUser) {
        ptUser.setCreateTime(new Date());
        if(ptUserMapper.insertPtUser(ptUser)>0)
            return true;
        return false;
    }

    @Override
    public boolean updatePtUserPwd(String oldPwd, String newPwd, int id) {
        if(ptUserMapper.updatePtUserPwd(Utils.makeMD5(newPwd),Utils.makeMD5(oldPwd),id)>0)
            return true;
        return false;
    }
}
