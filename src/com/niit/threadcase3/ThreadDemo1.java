package com.niit.threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        * 多线程的第三种实现方式
        *
        *   特点：可以获取到多线程的与行结果，有返回值
        *
        *   1.创建一个类MyCallable实现Callable接口
        *   2.重写call()---->是有返回值的，表示多线程的运行结果
        *   3.创建MyCallable的对象，表示多线程要执行的任务
        *   4.创建Futrue对象，管理多线程的运行结果   -->Futrue是一个接口不能直接获取对象，应该获取其实现类FutrueTask的对象
        *   5.创建Thread对象，表示线程，并启动
        *
        * */
        //创建一个类MyCallable实现Callable接口
        MyCallable mc = new MyCallable();
        //创建Futrue对象，管理多线程的运行结果
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建Thread对象，表示线程，并启动
        Thread t1 = new Thread(ft);
        t1.start();
        //获取多线程的运行结果
        Integer result = ft.get();
        System.out.println(result);

    }
}
