package com.day17.test5;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程1：" + i);
                }
            }
        });
        //守护线程
//        thread.setDaemon(true);

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程2：" + i);
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程3：" + i);
                }
            }
        });

        thread.setPriority(10);
        thread2.setPriority(10);
        thread3.setPriority(10);

        Thread.currentThread().setPriority(1);

        thread.start();
        thread2.start();
        thread3.start();

        System.out.println(123456);
    }
}
