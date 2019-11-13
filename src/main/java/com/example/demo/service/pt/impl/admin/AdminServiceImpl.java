package com.example.demo.service.pt.impl.admin;/*
 * @author p78o2
 * @date 2019/11/12
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.pt.PtAdmin;
import com.example.demo.entity.po.pt.PtPermission;
import com.example.demo.entity.po.pt.PtRole;
import com.example.demo.entity.po.pt.PtWorkCategory;
import com.example.demo.mapper.pt.admin.AdminMapper;
import com.example.demo.service.pt.admin.AdminService;
import com.example.demo.util.PageInfo;
import com.example.demo.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public R login(String tel, String pwd) {
        if(adminMapper.getExistAdmin(tel)>0){
            if(adminMapper.getCheckPwd(tel,Utils.makeMD5(pwd))>0){
                String token = Utils.makeMD5(tel+pwd+String.valueOf(new Date()));
                if(adminMapper.updateAdminToken(token,tel,Utils.makeMD5(pwd))>0){
                    return new R(true,200,token,"登陆成功");
                }else{
                    return new R(false,503,null,"登陆失败");
                }
            }else{
                return new R(false,502,null,"密码不正确");
            }
        }else{
            return new R(false,501,null,"账号不存在");
        }
    }

    @Override
    public boolean updatePwd(String oldPwd, String newPwd, int id) {
        if(adminMapper.updatePtAdminPwd(oldPwd,newPwd,id)>0)
            return true;
        return false;
    }

    @Override
    public PageInfo<PtAdmin> getAllAdminByPage(String nickName, int page, int perPage) {
        if("".equals(nickName))
            nickName = null;
        int start = (page-1)*perPage;
        int count = adminMapper.getCountPtAdmin(nickName);
        List<PtAdmin> ptAdminList = new ArrayList<>();
        ptAdminList = adminMapper.getPagePtAdmin(nickName,start,perPage);
        PageInfo<PtAdmin> pageInfo = new PageInfo<>();
        pageInfo.setCount(count);
        pageInfo.setList(ptAdminList);
        return pageInfo;
    }

    @Override
    public Boolean ioePtAdmin(PtAdmin ptAdmin) {
        if(ptAdmin.getId()==null){
//            新增
//            检查手机号码是否重复
            if(adminMapper.getExistAdmin(ptAdmin.getTel())>0)
                return null;

        }else{
//            修改
        }
        return null;
    }

    @Override
    public boolean deletePtAdmin(int id) {
        return false;
    }

    @Override
    public PageInfo<PtRole> getAllPtRoleByPage(int page, int perPage) {
        return null;
    }

    @Override
    public Boolean ioePtRole(PtRole ptRole) {
        return null;
    }

    @Override
    public boolean deleteAdmin(int id) {
        return false;
    }

    @Override
    public PageInfo<PtAdmin> getAllAdminByPageByRole(String nickName, int roleId, int page, int perPage) {
        return null;
    }

    @Override
    public PageInfo<PtPermission> getFirstPermissionByRole(int roleId, int page, int perPage) {
        return null;
    }

    @Override
    public List<PtPermission> getSecondPermissionByRole(int permissionid, int roleId, int page, int perPage) {
        return null;
    }

    @Override
    public PageInfo<PtPermission> getFirstPermission(int page, int perPage) {
        return null;
    }

    @Override
    public List<PtPermission> getSecondPermission(int id) {
        return null;
    }

    @Override
    public Boolean ioePtPermission(PtPermission ptPermission) {
        return null;
    }

    @Override
    public boolean deletePermission(int id) {
        return false;
    }

    @Override
    public List<PtWorkCategory> getAllFirstWorkCategory() {
        return null;
    }

    @Override
    public List<PtWorkCategory> getAllSecondWorkCategory(int id) {
        return null;
    }

    @Override
    public Boolean ioeWorkCategory(PtWorkCategory ptWorkCategory) {
        return null;
    }

    @Override
    public boolean deleteWorkCategory(int id) {
        return false;
    }
}
