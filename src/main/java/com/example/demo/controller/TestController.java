package com.example.demo.controller;/*
 * @author p78o2
 * @date 2019/8/27
 */

import com.example.demo.callback.R;
import com.example.demo.entity.po.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//api 项目都写这个，如果是前后端不分离的项目就写@Controller
@RestController
@RequestMapping("/demo/boot")
public class TestController {
    @Autowired
    private TestService testService;
//    无参数示例
    @GetMapping(value = "/getAllTest")
    public R getAllTest(){
        return new R(true,200,testService.getAllTest(),"");
    }

//    GetMapping这个注解就是用get方法去接收前端请求，
//    这个方法参数放在url上 ？ 后面
    @GetMapping(value = "/getTestEquals")
//    id 就是前端传过来的时候的字段名
    public R getTestEquals (int id){
//        直接返回new R 这种方式叫匿名对象
        return new R(true,200,testService.getTestEquals(id),"");
    }

//    这个方法是用rest 方法接收数据 参数放在 /demo/boot/getTestLike/参数值（前端没有参数名，直接写值就好了）
    @GetMapping(value = "/getTestLike/{name}")
//    @PathVariable 这个注解是获取rest 方式的参数
    public R getTestLike(@PathVariable("name") String name){
        return new R(true,200,testService.getTestLike(name),"");
    }

//    这个方法是 参数放在from表单提交
//    接收方式是post,前端请求的test 对象熟悉名 与 Test类一样
    @PostMapping(value = "/insertTest")
    public R insertTest(Test test){
        return new R(true,200,testService.insertTest(test),"");
    }

//    这个方法是 参数是用json字符串方式提交
    @PostMapping(value = "/updateTest")
//    @RequestBody这个注解意思就是用json字符串方式提交，如果你接收的是一个列表，就一定是用这个方式，对象的话就随意，表单也行这种也行
//    然后只要前端传的字符串的属性名对上就会自己构建成对象，好像是叫反射，这个是除new 之外另外一个创建对象的方式
    public R updateTest(@RequestBody Test test){
        return new R(true,200,testService.updateTest(test),"");
    }

    @PostMapping(value = "/deleteTest")
//    @RequestParam 这个注解就是说id 这个字段必传，不传就报错
    public R deleteTest(@RequestParam int id){
        return new R(true,200,testService.deleteTest(id),"");
    }
}
