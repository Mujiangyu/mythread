package com.niit.threadcase1;

public class ThreadDemo1 {
    public static void main(String[] args) {
        /*
        * 多线程的第一种启动方式
        *   定义一个类继承thread类
        *   重写run方法
        *   创建子类对象，并启动线程
        *
        * */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //开启线程
        t1.setName("线程1");
        t2.setName("线程2");
        //两个线程交替执行
        t2.start();
        t1.start();

    }
}
