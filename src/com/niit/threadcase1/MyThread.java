package com.niit.threadcase1;

public class MyThread extends Thread{
    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"多线程");
        }
    }
}
