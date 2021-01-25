package com.day7.test5;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
//接口不是类，没有class修饰
// public abstract  class MyAbs{}


public interface MyInterface {

    public abstract void eat();

    void run();

    public default void defaultMethod() {

    }

    public static void staticMethod() {

    }

}
