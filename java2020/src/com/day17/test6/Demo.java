package com.day17.test6;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo {

    static int num = 100;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (num <= 0) {
                            System.out.println("票卖完了");
                            break;
                        }
                        System.out.println("卖票：" + Thread.currentThread().getName() + ",票号：" + num);
                        num--;
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (num <= 0) {
                            System.out.println("票卖完了");
                            break;
                        }
                        System.out.println("卖票：" + Thread.currentThread().getName() + ",票号：" + num);
                        num--;
                    }
                }
            }
        }).start();

    }

    public void a() {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}
