package com.day17.test5;

import javax.print.attribute.standard.RequestingUserName;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @auth admin
 * @date 2021/1/25
 * @Description
 */
public class Demo {
    public static void main(String[] args) throws Exception {
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        thread.start();
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("123");
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//
//        Callable callable = new Callable() {
//            @Override
//            public String call() throws Exception {
//                return "hello";
//            }
//        };
//        FutureTask task = new FutureTask(callable);
//        Thread thread = new Thread(task);
//        thread.start();
//        System.out.println(task.get());

        Thread thread = new Thread(() -> {
            System.out.println("123");
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();

        FutureTask<String> task = new FutureTask(() -> {
            return "123";
        });
        Thread thread1 = new Thread(task);
        thread1.start();
        System.out.println(task.get());

        new Thread(new FutureTask<Integer>(() -> {
            System.out.println(Thread.currentThread().getName());
            return 123;
        })).start();

    }

}
