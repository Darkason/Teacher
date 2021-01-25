package com.day17.test;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("1");

//        MyThread myThread = new MyThread();
        MyThread myThread = new MyThread("线程1");
        myThread.start();

        System.out.println("2");

        MyThread myThread2 = new MyThread("线程2");
        myThread2.start();

        System.out.println("3");

        //cpu要么执行主线程main,要么执行自定义线程

        //优先级高的一定能抢到cpu吗？

//        myThread.run();
//        myThread.a();

//        System.out.println("main:" + Thread.currentThread().getId());
//        System.out.println("main:" + Thread.currentThread().getName());

    }

}
