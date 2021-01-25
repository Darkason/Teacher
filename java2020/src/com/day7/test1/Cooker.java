package com.day7.test1;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Cooker extends Person {

    String name = "马云";

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
