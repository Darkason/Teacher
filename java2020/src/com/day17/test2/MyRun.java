package com.day17.test2;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class MyRun implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRun:"+System.currentTimeMillis());
        System.out.println("id:" + Thread.currentThread().getId());
        System.out.println("name:" + Thread.currentThread().getName());
    }

}
