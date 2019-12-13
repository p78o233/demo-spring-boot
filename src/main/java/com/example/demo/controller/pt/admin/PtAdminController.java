package com.example.demo.controller.pt.admin;/*
 * @author p78o2
 * @date 2019/11/14
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.pt.PtAdmin;
import com.example.demo.service.pt.admin.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/pt/pt-admin/index")
@Api(value = "管理员模块")
public class PtAdminController {
    @Autowired
    private AdminService adminService;
    @ApiOperation(value = "测试接口")
    @GetMapping(value = "/test")
    public void test(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        System.out.println(httpSession.getAttribute("adminId"));
    }
    @ApiOperation(value = "登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name="tel",value = "登陆账号",dataType = "String",paramType = "query",example = "1"),
            @ApiImplicitParam(name="pwd",value = "密码",dataType = "String",paramType = "query",example = "1")
    })
    @PostMapping(value = "/login")
    public R login(String tel,String pwd){
        return adminService.login(tel,pwd);
    }
    @ApiOperation(value = "修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oldPwd",value = "旧密码",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "newPwd",value = "新密码",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "id",value = "管理员id",dataType = "int",paramType = "query")
    })
    @PostMapping(value = "/updatePwd")
    public R updatePwd(String oldPwd,String newPwd,int id){
        if(adminService.updatePwd(oldPwd,newPwd,id)) {
            return new R(true, 200,true , "操作成功");
        }else{
            return new R(true, 500,false , "操作失败");
        }
    }
    @ApiOperation(value = "分页获取")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nickName",value = "昵称",dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "page",value = "第几页",dataType = "int",paramType = "query"),
            @ApiImplicitParam(name = "perPage",value = "每页大小",dataType = "int",paramType = "query")
    })
    @GetMapping(value = "/getAllAdminByPage")
    public R getAllAdminByPage(@RequestParam(defaultValue = "")String nickName,@RequestParam(defaultValue = "1")int page,@RequestParam(defaultValue = "10")int perPage){
        return new R(true,200,adminService.getAllAdminByPage(nickName,page,perPage),"查询成功");
    }
    @ApiOperation(value = "新增或修改管理员")
    @PostMapping(value = "/ioePtAdmin")
    public R ioePtAdmin(HttpServletRequest request,@RequestBody PtAdmin ptAdmin){
        HttpSession session = request.getSession();
        int adminId = (int)session.getAttribute("adminId");
        if(adminService.ioePtAdmin(ptAdmin,adminId)){
            return new R(true,200,true,"操作成功");
        }else{
            return new R(false,500,false,"操作失败");
        }
    }
    @ApiOperation(value = "/删除管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "删除管理员的id",dataType = "int",paramType = "form")
    })
    @PostMapping(value = "/deletePtAdmin")
    public R deletePtAdmin(HttpServletRequest request,int id){
        HttpSession session = request.getSession();
        int adminId = (int)session.getAttribute("adminId");
        if(adminService.deletePtAdmin(id,adminId))
            return new R(true,200,true,"操作成功");
        return new R(false,500,false,"操作失败");
    }
}
