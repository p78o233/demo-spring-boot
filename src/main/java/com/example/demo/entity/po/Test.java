package com.example.demo.entity.po;/*
 * @author p78o2
 * @date 2019/10/17
 */

public class Test {
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
