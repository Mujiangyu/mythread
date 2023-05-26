package com.niit.threadmethod;

public class ThreadMethodDemo1 {
    public static void main(String[] args) throws InterruptedException {

        /*
        * String getName() 返回此线程的名称
        * void setName(String name) 设置线程的名称
        * 细节： 如果没有设置名字，线程也会有默认的格式(Thread 的构造方法也可以设置名字  Thread(String name) )
        *
        * static Thread currentThread()  获取当前线程的对象
        * 当JVM虚拟机启动后，会自动启动多个线程，其中有一条线程叫做main线程
        * 作用式调用main方法，并执行其中的代码
        * 之前我们所写的所有代码其实都是运行在main线程中的
        *
        * static void sleep(long time)   让线程休眠指定的时间，单位为毫秒
        *那条线程执行到这个方法，那么那条线程就会在这里停留对应的时间
        * 当时间到了之后，线程会自动醒来，并继续执行下面的代码，
        * */

        MyThread mt = new MyThread("norman");
        MyThread mt1 = new MyThread("qianqian");
        mt.start();
        mt1.start();


       /* Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);*/
/*
        System.out.println("1111111111111");
        Thread.sleep(5000);
        System.out.println("2222222222222");*/
    }
}
