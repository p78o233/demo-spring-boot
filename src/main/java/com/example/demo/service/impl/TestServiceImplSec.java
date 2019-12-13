package com.example.demo.service.impl;/*
 * @author p78o2
 * @date 2019/11/8
 */

import com.example.demo.entity.po.Test;
import com.example.demo.entity.vo.User;
import com.example.demo.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testServiceImplSec")
public class TestServiceImplSec implements TestService {
    @Override
    public String mutil() {
        return "多态2";
    }

    @Override
    public List<Test> getAllTest() {
        return null;
    }

    @Override
    public List<Test> getTestEquals(int id) {
        return null;
    }

    @Override
    public List<Test> getTestLike(String name) {
        return null;
    }

    @Override
    public int insertTest(Test test) {
        return 0;
    }

    @Override
    public int updateTest(Test test) {
        return 0;
    }

    @Override
    public int deleteTest(int id) {
        return 0;
    }

    @Override
    public List<User> getUser() {
        return null;
    }
}
