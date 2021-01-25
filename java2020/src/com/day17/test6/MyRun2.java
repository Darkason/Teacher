package com.day17.test6;

public class MyRun2 implements Runnable {

    private Object obj;

    public MyRun2(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (obj) {
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
            }
        }
    }
}
