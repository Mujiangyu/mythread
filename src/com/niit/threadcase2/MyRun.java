package com.niit.threadcase2;

public class MyRun implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //获取到当前线程的对象
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"多线程");
        }
    }
}
