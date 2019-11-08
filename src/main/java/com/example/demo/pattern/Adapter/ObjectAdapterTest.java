package com.example.demo.pattern.Adapter;/*
 * @author p78o2
 * @date 2019/11/6
 */
//模式的应用场景
//        适配器模式（Adapter）通常适用于以下场景。
//        以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。
//        使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同。
public class ObjectAdapterTest {
    public static void main(String[] args)
    {
        System.out.println("对象适配器模式测试：");
        try
        {
            Class<?> c=Class.forName("com.example.demo.pattern.Adapter.ClassAdapter1");
            Object obj=c.newInstance();
            Target target=(Target)obj;
            ((Target) obj).request();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
//目标接口
interface Target
{
    public void request();
}
//适配者接口
class Adaptee1
{
    public void specificRequest1()
    {
        System.out.println("适配者中的业务代码被调用！1");
    }
}
class Adaptee2
{
    public void specificRequest2()
    {
        System.out.println("适配者中的业务代码被调用！2");
    }
}
//类适配器类
class ClassAdapter1 implements Target
{
    private Adaptee1 adaptee1;
    public ClassAdapter1()
    {
        adaptee1=new Adaptee1();
    }
    public void request()
    {
        adaptee1.specificRequest1();
    }
}
class ClassAdapter2 implements Target
{
    private Adaptee2 adaptee2;
    public ClassAdapter2()
    {
        adaptee2=new Adaptee2();
    }
    public void request()
    {
        adaptee2.specificRequest2();
    }
}