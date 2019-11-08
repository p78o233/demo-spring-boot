package com.example.demo.service;/*
 * @author p78o2
 * @date 2019/10/17
 */

import ch.qos.logback.core.db.dialect.HSQLDBDialect;
import com.example.demo.entity.po.Test;

import java.util.List;

public interface TestService {
//    多态列子
    String mutil();
//    sql无条件查询列子
    List<Test> getAllTest();
//    sql精确查询例子
    List<Test> getTestEquals(int id);
//    sql模糊查询例子
    List<Test> getTestLike(String name);
//    sql新增列子
    int insertTest(Test test);
//    sql更新列子
    int updateTest(Test test);
//    sql删除例子
    int deleteTest(int id);
 }
