package com.day17.test;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("hello");
        Thread thread = Thread.currentThread();
        System.out.println("当前线程名字：" + thread.getName());
        System.out.println("当前线程id：" + thread.getId());

    }

    public void a() {
    }


}
