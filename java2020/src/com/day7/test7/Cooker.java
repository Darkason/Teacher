package com.day7.test7;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */

//接口中的变量都是常量
public interface Cooker {

    public static final String NAME = "马云";
    String name1 = "马云";
    public static String name3 = "马云";

    String HELLO_WORLD = "";
//    String HELLO_WORLD2;

    abstract void cooke();

    void eat();

}
