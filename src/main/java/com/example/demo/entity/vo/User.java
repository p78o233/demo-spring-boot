package com.example.demo.entity.vo;/*
 * @author p78o2
 * @date 2019/12/13
 */

import java.util.List;

public class User {
    private String name;
    private String card;
    private int giveParentAmount;
    List<User> child;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public int getGiveParentAmount() {
        return giveParentAmount;
    }

    public void setGiveParentAmount(int giveParentAmount) {
        this.giveParentAmount = giveParentAmount;
    }

    public List<User> getChild() {
        return child;
    }

    public void setChild(List<User> child) {
        this.child = child;
    }

    public User(String name, String card, int giveParentAmount, List<User> child) {
        this.name = name;
        this.card = card;
        this.giveParentAmount = giveParentAmount;
        this.child = child;
    }
}
