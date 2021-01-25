package com.day8;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test6 {

    public static void main(String[] args) {
        c();
    }

    public static void c() {

        try {
            try {
                int a = 1 / 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("1");

        } catch (Exception e) {
            e.printStackTrace();

            try {
                int a=1/0;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            System.out.println("hello");

        } finally {

            try {
                int a = 1 / 0;
            } catch (Exception e) {
                e.printStackTrace();

            }
            System.out.println("无论如何都会执行");

        }


    }

    public static void b() {
        System.out.println("hello");

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("world");

        try {
            int[] arr = {1, 2};
            System.out.println(arr[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("今天放假，我说的");

        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void a() {
        try {
            System.out.println("hello");

//            int i = 1 / 0;

            System.out.println("world");

//            int[] arr = {1, 2};
//            System.out.println(arr[2]);

            System.out.println("今天放假，我说的");

            String name = null;
            System.out.println(name.length());

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("算数异常");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("下标越界异常");
        } catch (Exception e) {
            System.out.println("异常");
        }

    }

}
