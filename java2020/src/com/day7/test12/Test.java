package com.day7.test12;

import java.io.Serializable;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test implements Serializable {

    public static void main(String[] args) {

//        int result = s(1, 2, new Calculator() {
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        });

        int result2 = s(1, 2, (int aaa, int bbb) -> {
            return aaa + bbb;
        });

        int result3 = s(1, 2, (aaa, bbb) -> {
            return aaa + bbb;
        });
        System.out.println(result2);
    }

    public static int s(int a, int b, Calculator calculator) {
        return calculator.sum(a, b);
    }

}
