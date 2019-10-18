package com.example.demo.mapper;/*
 * @author p78o2
 * @date 2019/10/17
 */

import com.example.demo.entity.po.Test;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    @Select("select * from test")
    List<Test> getAllTest();
}
