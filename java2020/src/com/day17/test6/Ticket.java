package com.day17.test6;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Ticket implements Runnable {

    Integer num = 100;

    //共享资源
    private Object obj = new Object();
    private Demo demo = new Demo();

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

//    @Override
//    public void run() {
//        synchronized (this) {
//            while (true) {
//                if (num <= 0) {
//                    System.out.println("票卖完了");
//                    break;
//                }
//                System.out.println("卖票：" + Thread.currentThread().getName() + ",票号：" + num);
//                num--;
//            }
//        }
//    }

//    @Override
//    public void run() {
//        Object obj2 = new Object();
//        while (true) {
//            //锁代码块
//            //卡住了，  阻塞
////            synchronized (obj) {
////            synchronized (demo) {
////            synchronized (this) {
//            synchronized (obj2) {
////                System.out.println("obj:" + obj);
//                if (num <= 0) {
//                    System.out.println("票卖完了");
//                    break;
//                }
//                System.out.println("卖票：" + Thread.currentThread().getName() + ",票号：" + num);
//                num--;
//            }
//        }
//    }
}
