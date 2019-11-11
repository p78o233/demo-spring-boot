package com.example.demo.service.pt.admin;/*
 * @author p78o2
 * @date 2019/11/11
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.pt.PtAdmin;
import com.example.demo.entity.po.pt.PtPermission;
import com.example.demo.entity.po.pt.PtRole;
import com.example.demo.entity.po.pt.PtWorkCategory;
import com.example.demo.util.PageInfo;

import java.util.List;

public interface AdminService {
//    登陆
    public R login(String tel,String pwd);
//    修改密码
    public boolean updatePwd(String oldPwd,String newPwd,int id);

//    管理员管理
    public PageInfo<PtAdmin> getAllAdminByPage(String nickName,int page,int perPage);
    public Boolean ioePtAdmin(PtAdmin ptAdmin);
    public boolean deletePtAdmin(int id);

//    角色管理
    public PageInfo<PtRole> getAllPtRoleByPage(int page,int perPage);
    public Boolean ioePtRole(PtRole ptRole);
    public boolean deleteAdmin(int id);
//    通过角色查用户
    public PageInfo<PtAdmin> getAllAdminByPageByRole(String nickName,int roleId,int page,int perPage);
//    通过角色查权限
    public PageInfo<PtPermission> getFirstPermissionByRole(int roleId,int page,int perPage);
    public List<PtPermission> getSecondPermissionByRole(int permissionid,int roleId,int page,int perPage);
//    权限管理
    public PageInfo<PtPermission> getFirstPermission(int page,int perPage);
    public List<PtPermission> getSecondPermission(int id);
    public Boolean ioePtPermission(PtPermission ptPermission);
    public boolean deletePermission(int id);

//    工作类别管理
    public List<PtWorkCategory> getAllFirstWorkCategory();
    public List<PtWorkCategory> getAllSecondWorkCategory(int id);
    public Boolean ioeWorkCategory(PtWorkCategory ptWorkCategory);
    public boolean deleteWorkCategory(int id);
}
