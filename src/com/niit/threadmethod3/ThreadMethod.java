package com.niit.threadmethod3;

import com.niit.threadmethod.MyThread;

public class ThreadMethod {
    public static void main(String[] args) {
        /*
        * final void setDaemon(boolean on)  设置为守护线程
        * 细节：
        *       但其他的肥瘦呼吸那成执行完毕后，守护线程没有存在的必要，就会陆续的结束
        *
        *
        *
        * */
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        mt1.setName("女神");
        mt2.setName("备胎");

        //将第二个线程设置为守护线程
        mt2.setDaemon(true);

        mt1.start();
        mt2.start();

    }
}
