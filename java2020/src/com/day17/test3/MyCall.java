package com.day17.test3;

import java.util.concurrent.Callable;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class MyCall implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("id:" + Thread.currentThread().getId());
        System.out.println("name:" + Thread.currentThread().getName());



        return "这是返回值";
    }
}
