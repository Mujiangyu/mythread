package com.niit.threadmethod4;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
            //表示出让当前CPU的执行权，所有线程重新抢夺CPU的执行权，会让线程交替执行的更加均匀
            Thread.yield();
        }
    }
}
