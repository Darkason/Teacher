package com.day8;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test5 {

    public static void main(String[] args) {
        try {
            print(0);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void print(int a) throws Throwable {
        System.out.println("hello");

        if (a == 0) {
//            throw new RuntimeException("0不能做除数");
            throw new Exception("0不能做除数");
//            throw new Throwable("0不能做除数");
        }
        int i = 1 / a;
        System.out.println("world");
    }
}
