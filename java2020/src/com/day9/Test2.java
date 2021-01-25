package com.day9;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
//        System.exit(0);

        long start = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
//        System.out.println(str);

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
