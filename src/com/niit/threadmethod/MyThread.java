package com.niit.threadmethod;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+"hello");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
