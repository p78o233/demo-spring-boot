package com.example.demo.pattern.Singleton;/*
 * @author p78o2
 * @date 2019/11/6
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//多例模式-懒汉
public class MutilSingletonLazy {
    public static void main(String[] args)
    {
        Mutile.init();
        for(int i=0;i<10;i++) {
            Mutile zt1 = Mutile.getInstance();
            Mutile zt2 = Mutile.getInstance();
            if (zt1 == zt2) {
                System.out.println("他们是同一人！");
            } else {
                System.out.println("他们不是同一人！");
            }
        }
    }
}
class Mutile{
    private static volatile Mutile instance=null;    //保证instance在所有线程中同步
    static List<Mutile>  mutileList = new ArrayList<>();
    private static final Random random = new Random();
    private Mutile(){

    }
    public Mutile (int n){

    }
    public static void init() {
        for(int i=0;i<2;i++){
            mutileList.add(new Mutile());
        }
    }
    public static Mutile getInstance() {
        int index = random.nextInt(2);
        return mutileList.get(index);
    }

}