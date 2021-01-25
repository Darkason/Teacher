package com.day17.test2;

import com.test.MyRunnable;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println("1:"+System.currentTimeMillis());

        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun,"线程1");
        thread.start();

        System.out.println(2);

        Thread thread2 = new Thread(myRun,"线程2");
        thread2.start();

        System.out.println(3);
//        myRun.run();

    }
}
