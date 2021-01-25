package com.day17.test6;

public class MyRun1 implements Runnable {

    private Object obj;

    public MyRun1(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (obj) {
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
            }
        }
    }
}
