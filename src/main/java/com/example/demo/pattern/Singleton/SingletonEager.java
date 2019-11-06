package com.example.demo.pattern.Singleton;/*
 * @author p78o2
 * @date 2019/11/6
 */
//单例模式-饿汉模式
public class SingletonEager {
    public static void main(String[] args)
    {
        Bajie obj1=Bajie.getInstance();
        Bajie obj2=Bajie.getInstance();
        if(obj1==obj2)
        {
            System.out.println("他们是同一人！");
        }
        else
        {
            System.out.println("他们不是同一人！");
        }
    }
}
class Bajie
{
    private static Bajie instance=new Bajie();
    private Bajie()
    {
        System.out.println("构造函数");
    }
    public static Bajie getInstance()
    {
        return instance;
    }
}