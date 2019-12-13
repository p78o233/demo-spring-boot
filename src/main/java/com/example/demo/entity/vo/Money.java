package com.example.demo.entity.vo;/*
 * @author p78o2
 * @date 2019/12/13
 */

public class Money {
    private int id;
//    A
    private String name;
//    A的卡
    private String card;
//    金额
    private int ammount;
//    1收入 -1 支出
    private int st;
//    B
    private String toName;
//    B的卡
    private String toCard;

    public Money() {
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

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToCard() {
        return toCard;
    }

    public void setToCard(String toCard) {
        this.toCard = toCard;
    }

    public Money(int id, String name, String card, int ammount, int st, String toName, String toCard) {
        this.id = id;
        this.name = name;
        this.card = card;
        this.ammount = ammount;
        this.st = st;
        this.toName = toName;
        this.toCard = toCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
