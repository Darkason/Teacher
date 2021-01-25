package com.day8;

import java.io.File;
import java.io.FileInputStream;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        //不会发生异常的代码不需要捕获
        System.out.println("hello");
        try {
            int i = 1 / 0;
            System.out.println("world");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("通知：今天放假");
    }

    public static void a() {

        try {
            int a = 1 / 0;
            for (int i = 0; i < 10; i++) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
