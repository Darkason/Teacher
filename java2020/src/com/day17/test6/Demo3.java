package com.day17.test6;

import com.day17.test2.MyRun;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo3 {

    public static void main(String[] args) {
        Object obj = new Object();

        MyRun1 myRun = new MyRun1(obj);
        MyRun2 myRun2 = new MyRun2(obj);

        Thread thread = new Thread(myRun);
        Thread thread2 = new Thread(myRun2);

        thread.start();
        thread2.start();

    }

}
