package com.example.demo.entity.po;/*
 * @author p78o2
 * @date 2019/10/17
 */

import java.io.Serializable;

//对应数据库表中的test表
//与数据库表对应的都写在po包里面
//这个是序列表的意思
public class Test implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test() {
    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
