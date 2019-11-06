package com.example.demo.pattern.Prototype;/*
 * @author p78o2
 * @date 2019/11/6
 */

//原型模式

//原型模式的应用场景
//        原型模式通常适用于以下场景。
//        对象之间相同或相似，即只是个别的几个属性不同的时候。
//        对象的创建过程比较麻烦，但复制比较简单的时候。
//        原型模式的扩展

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype(1,"p78o2","哇哈哈");
        obj1.display();
        Realizetype obj2 = (Realizetype) obj1.clone();
        obj2.setName("噢噢噢");
        obj2.display();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}

//具体原型类
class Realizetype implements Cloneable {
    private int id;
    private String name;
    private String msg;

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Realizetype(int id, String name, String msg) {
        this.id = id;
        this.name = name;
        this.msg = msg;
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
    public void display(){
        System.out.println(id+" "+name+" "+msg);
    }
}