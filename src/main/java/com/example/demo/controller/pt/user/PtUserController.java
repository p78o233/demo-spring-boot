package com.example.demo.controller.pt.user;/*
 * @author p78o2
 * @date 2019/11/11
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.pt.PtUser;
import com.example.demo.service.pt.user.PtUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pt/pt-user/index")
@Api(description = "兼职用户模块")
public class PtUserController {
    @Autowired
    private PtUserService ptUserService;

    @PostMapping(value = "/login")
    @ApiOperation(value = "用户登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tel",value = "手机号码",dataType = "String",paramType = "query",example = "123456"),
            @ApiImplicitParam(name = "pwd",value = "密码",dataType = "String",paramType = "query",example = "123456")
    })
    public R login(@RequestParam String tel,@RequestParam String pwd){
        return ptUserService.loginPtUser(tel,pwd);
    }

    @PostMapping(value = "/register")
    @ApiOperation(value = "用户注册")
    public R register(@RequestBody @ApiParam(name="兼职用户注册信息",value="ptUser",required=true) PtUser ptUser){
        Boolean flag = ptUserService.registerPtUser(ptUser);
        if(flag==null){
            return new R(false,300,flag,"手机号码不能重复");
        }else if(flag){
            return new R (true,200,flag,"注册成功");
        }else{
            return new R (false,300,flag,"注册失败");
        }
    }

    @PostMapping(value = "/updatePtUserPwd")
    @ApiOperation(value = "修改登陆密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oldPwd",value = "旧密码",dataType = "String",paramType = "query",example = "123456"),
            @ApiImplicitParam(name = "newPwd",value = "新密码",dataType = "String",paramType = "query",example = "123456"),
            @ApiImplicitParam(name = "id",value = "用户id",dataType = "String",paramType = "query",example = "123456"),
    })
    public R updatePtUserPwd(@RequestParam String oldPwd,@RequestParam String newPwd,@RequestParam int id){
        return new R(true,200,ptUserService.updatePtUserPwd(oldPwd,newPwd,id),"");

    }
    @GetMapping(value = "/test")
    public void test(){

    }
}
