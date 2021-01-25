package com.day17.test4;

import java.util.concurrent.FutureTask;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo {
    public static void main(String[] args) throws Exception {

        MyCall2 m = new MyCall2();
        FutureTask task = new FutureTask(m);
        Thread thread = new Thread(task, "线程1");
        thread.start();
        System.out.println(task.get());
    }
}
