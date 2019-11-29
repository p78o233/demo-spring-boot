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
    public Boolean ioePtAdmin(PtAdmin ptAdmin,int adminId) {
        if(ptAdmin.getId()==null){
//            新增
//            检查手机号码是否重复
            if(adminMapper.getExistAdmin(ptAdmin.getTel())>0)
                return null;
            ptAdmin.setCreateAdmin(adminId);
            ptAdmin.setCreateTime(new Date());
            ptAdmin.setPwd(Utils.makeMD5(ptAdmin.getPwd()));
            if(adminMapper.insertPtAdmin(ptAdmin)>0)
                return true;
            return false;
        }else{
//            修改
            ptAdmin.setModifyAdmin(adminId);
            ptAdmin.setModifyTime(new Date());
            if(adminMapper.updatePtAdmin(ptAdmin)>0)
                return true;
            return false;
        }
    }

    @Override
    public boolean deletePtAdmin(int id,int adminId) {
        PtAdmin ptAdmin = new PtAdmin();
        ptAdmin.setModifyTime(new Date());
        ptAdmin.setModifyAdmin(adminId);
        ptAdmin.setId(id);
        if(adminMapper.deletePtAdmin(ptAdmin)>0)
            return true;
        return false;
    }

    @Override
    public PageInfo<PtRole> getAllPtRoleByPage(int page, int perPage) {
        int start = (page-1)*perPage;
        int count = adminMapper.getPtRoleCount();
        List<PtRole> list = new ArrayList<>();
        list = adminMapper.getPtRolePage(start,perPage);
        PageInfo<PtRole> ptRolePageInfo = new PageInfo<>();
        ptRolePageInfo.setCount(count);
        ptRolePageInfo.setList(list);
        return ptRolePageInfo;
    }

    @Override
    public Boolean ioePtRole(PtRole ptRole,int adminId) {
        if(ptRole.getId()==null){
//            新增
            ptRole.setCreateAdmin(adminId);
            ptRole.setCreateTime(new Date());
            if(adminMapper.insertPtRole(ptRole)>0)
                return true;
            return false;
        }else {
//            修改
            ptRole.setModifyTime(new Date());
            ptRole.setModifyAdmin(adminId);
            if(adminMapper.updatePtRole(ptRole)>0)
                return true;
            return false;
        }
    }

    @Override
    public boolean deleteAdmin(int id,int adminId) {
        if(adminMapper.deletePtRole(id,new Date(),adminId)>0)
            return true;
        return false;
    }

    @Override
    public PageInfo<PtAdmin> getAllAdminByPageByRole(String nickName, int roleId, int page, int perPage) {
        if("".equals(nickName)){
            nickName = null;
        }
        int start = (page-1)*perPage;
        int count = adminMapper.getAdminByRoleCount(nickName,roleId);
        List<PtAdmin> list = new ArrayList<>();
        list = adminMapper.getAdminByRolePage(nickName,roleId,start,perPage);
        PageInfo<PtAdmin> pageInfo = new PageInfo<>();
        pageInfo.setCount(count);
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public PageInfo<PtPermission> getFirstPermissionByRole(int roleId, int page, int perPage) {
        int start = (page-1)*perPage;
        int count = adminMapper.getPerByRoleCount(roleId);
        List<PtPermission> list = new ArrayList<>();
        list = adminMapper.getPerByRolePage(roleId,start,perPage);
        PageInfo<PtPermission> pageInfo = new PageInfo<>();
        pageInfo.setCount(count);
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public PageInfo<PtPermission> getSecondPermissionByRole(int permissionid, int roleId, int page, int perPage) {
        int start = (page-1)*perPage;
        int count = adminMapper.getPerByRoleSecCount(roleId,permissionid);
        List<PtPermission> list = new ArrayList<>();
        list = adminMapper.getPerByRoleSecPage(roleId,permissionid,start,perPage);
        PageInfo<PtPermission> pageInfo = new PageInfo<>();
        pageInfo.setCount(count);
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public PageInfo<PtPermission> getFirstPermission(int page, int perPage) {
        int start = (page-1)*perPage;
        int count = adminMapper.getPerCount();
        List<PtPermission> list = new ArrayList<>();
        list = adminMapper.getPerPage(start,perPage);
        PageInfo<PtPermission> pageInfo = new PageInfo<>();
        pageInfo.setCount(count);
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public List<PtPermission> getSecondPermission(int id) {
        return adminMapper.getPerSecPage(id);
    }

    @Override
    public Boolean ioePtPermission(PtPermission ptPermission,int adminId) {
        if(ptPermission.getId()==null){
            ptPermission.setCreateAdmin(adminId);
            ptPermission.setCreateTime(new Date());
            if(adminMapper.insertPtPermission(ptPermission)>0)
                return true;
            return false;
        }else{
            ptPermission.setModifyAdmin(adminId);
            ptPermission.setModifyTime(new Date());
            if(adminMapper.updatePtPermission(ptPermission)>0)
                return true;
            return false;
        }
    }

    @Override
    public boolean deletePermission(int id,int adminId) {
        if(adminMapper.deletePtPermission(id,new Date(),adminId)>0)
            return true;
        return false;
    }

    @Override
    public List<PtWorkCategory> getAllFirstWorkCategory() {
        return adminMapper.getAllPtWorkCategory();
    }

    @Override
    public List<PtWorkCategory> getAllSecondWorkCategory(int id) {
        return adminMapper.getAllPtWorkCategorySec(id);
    }

    @Override
    public Boolean ioeWorkCategory(PtWorkCategory ptWorkCategory,int adminId) {
        if(ptWorkCategory.getId()==null){
            ptWorkCategory.setCreateTime(new Date());
            ptWorkCategory.setCreateAdmin(adminId);
            if(adminMapper.insertPtWorkCategory(ptWorkCategory)>0)
                return true;
            return false;
        }else{
            ptWorkCategory.setModifyTime(new Date());
            ptWorkCategory.setModifyAdmin(adminId);
            if(adminMapper.updatePtWorkCategory(ptWorkCategory)>0)
                return true;
            return false;
        }
    }

    @Override
    public boolean deleteWorkCategory(int id,int adminId) {
        if(adminMapper.deletePtWorkCategory(id,new Date(),adminId)>0)
            return true;
        return false;
    }
}
