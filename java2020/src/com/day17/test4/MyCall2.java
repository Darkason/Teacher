package com.day17.test4;

import java.util.concurrent.Callable;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class MyCall2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return 123;
    }
}
