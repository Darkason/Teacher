package com.day17.test6;

import org.junit.Test;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo2 {

    int num = 100;

    @Test
    public void a() {

        Thread thread = new Thread(() -> {
            sale(num);
        });

        Thread thread2 = new Thread(() -> {
            sale(num);
        });

        Thread thread3 = new Thread(() -> {
            sale(num);
        });

        thread.start();
        thread2.start();
        thread3.start();
    }

    public static void sale(int num) {
        while (true) {
            if (num <= 0) {
                System.out.println("票卖完了");
                break;
            }
            System.out.println("卖票：" + Thread.currentThread().getName() + ",票号：" + num);
            num--;
        }
    }

}
