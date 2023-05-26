package com.niit.threadcase2;

public class ThreadDemo1 {
    public static void main(String[] args) {
        /*
        * 多线程的第二种启动方式
        *   自己定义一个类实现runnable接口
        *   重写run方法
        *   创建自己的类的对象
        *   创建一个Thread类的对象，并开启线程
        * */
        //创建自己的类的对象
        //表示多线程要执行的任务
        MyRun mr = new MyRun();

        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();


    }
}
