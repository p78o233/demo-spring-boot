package com.example.demo.controller;/*
 * @author p78o2
 * @date 2019/8/27
 */

import com.example.demo.callback.R;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo/boot")
public class StockController {
    @Autowired
    private TestService testService;
    @GetMapping(value = "/getAllTest")
    public R getAllTest(){
        return new R(true,200,testService.getAllTest(),"");
    }


}
