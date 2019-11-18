package com.example.demo.controller.pt.admin;/*
 * @author p78o2
 * @date 2019/11/14
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/pt/pt-admin/index")
@Api(description = "兼职用户模块")
public class PtAdminController {
    @ApiOperation(value = "测试接口")
    @GetMapping(value = "/test")
    public void test(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        System.out.println(httpSession.getAttribute("adminId"));
    }
}
