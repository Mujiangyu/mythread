package com.niit.threadmethod2;

public class ThreadMethod {
    public static void main(String[] args) {
        /*
        * setPriority(int newPriority)  设置线程的优先级
        * final int getPriority()       获取线程的优先级
        *
        * */
        //创建线程要执行的参数对象
        ThreadDemo td = new ThreadDemo();
        //创建线程对象
        Thread t = new Thread(td,"飞机");
        Thread t1 = new Thread(td,"坦克");

/*        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());*/

        t.setPriority(1);
        t1.setPriority(10);

        t.start();
        t1.start();


    }
}
