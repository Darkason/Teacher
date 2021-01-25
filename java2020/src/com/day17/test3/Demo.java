package com.day17.test3;

import java.util.concurrent.FutureTask;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        MyCall myCall = new MyCall();
//        myCall.start();

        FutureTask task = new FutureTask(myCall);

        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get());

        Thread.sleep(5000);


    }
}
