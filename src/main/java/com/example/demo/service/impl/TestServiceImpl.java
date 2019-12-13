package com.example.demo.service.impl;/*
 * @author p78o2
 * @date 2019/10/17
 */

import com.example.demo.entity.po.Test;
import com.example.demo.entity.vo.Money;
import com.example.demo.entity.vo.User;
import com.example.demo.mapper.TestMapper;
import com.example.demo.service.TestService;
import org.apache.poi.hssf.record.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public String mutil() {
        return "多态1";
    }

    @Override
    public List<Test> getAllTest() {
        List<Test> tests = new ArrayList<>();
        tests = testMapper.getAllTest();
        return tests;
    }

    @Override
    public List<Test> getTestEquals(int id) {
        List<Test> tests = new ArrayList<>();
        tests = testMapper.getTestEquals(id);
        return tests;
    }

    @Override
    public List<Test> getTestLike(String name) {
        List<Test> tests = new ArrayList<>();
        tests = testMapper.getTestLike(name);
        return tests;
    }

    @Override
    public int insertTest(Test test) {
        return testMapper.insertTest(test);
    }

    @Override
    public int updateTest(Test test) {
        return testMapper.updateTest(test);
    }

    @Override
    public int deleteTest(int id) {
        return testMapper.deleteTest(id);
    }

    @Override
    public List<User> getUser() {
        List<User> resultUserList = new ArrayList<>();
        List<Money> mlist = new ArrayList<>();
        mlist = testMapper.getMoney();
        int i = 0; //循环次数
        while (mlist.size()>0){
//            遍历剩余的money数据
//                获取自己做主动收入的金额，支出的金额，做被动收入的金额 支出的金额
            Money money  = mlist.get(0);
            int fromRecFrom =0,fromPayFrom = 0,toRecFrom = 0,toPayFrom = 0;
            int fromRecTo =0,fromPayTo = 0,toRecTo = 0,toPayTo = 0;
            User userFrom = new User();
            userFrom.setName(money.getName());
            userFrom.setCard(money.getCard());
            User userTo = new User();
            userTo.setCard(money.getToCard());
            userTo.setName(money.getToName());
//            统计第一行相关人员的关系
            for(Money money1 : mlist){
//                第一行数据在主动的人在主动位置的金额
                if(money1.getCard().equals(money.getCard())){
                    if(money1.getSt()==1){
                        fromRecFrom+=money1.getAmmount();
                    }else{
                        fromPayFrom+=money1.getAmmount();
                    }
                }
//                第一行数据在主动的人在被动位置的金额
                if(money1.getToCard().equals(money.getCard())){

                }
            }
        }
        return resultUserList;
    }
}
