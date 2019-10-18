package com.example.demo.service.impl;/*
 * @author p78o2
 * @date 2019/10/17
 */

import com.example.demo.entity.po.Test;
import com.example.demo.mapper.TestMapper;
import com.example.demo.service.TestService;
import org.apache.poi.hssf.record.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> getAllTest() {
        List<Test> tests = new ArrayList<>();
        tests = testMapper.getAllTest();
        return tests;
    }
}
