package com.day4;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test4 {

    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 1;

        short s1=1;
        short s2=1;

        int i1 = 1;
        int i2 = 1;

        long l1 = 1;
        long l2 = 1;

        //方法的重载
        //方法名相同
        //参数列表不同（参数的个数，参数的类型）
        System.out.println(compare(b1, b2));
        System.out.println(compare(i1, i2));
        System.out.println(compare(s1, s2));
//        System.out.println(compare(l1, l2));

    }

    public static boolean compare(byte a, byte b) {
        System.out.println("比较byte类型");
        boolean bool = a == b;
        return bool;
    }

    public static boolean compare(int a, int b) {
        System.out.println("比较int类型");
        boolean bool = a == b;
        return bool;
    }

}
