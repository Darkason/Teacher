package com.day4;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test2 {

    public static int a(String name) {
        System.out.println("hello:" + name);
        return 1;
        //System.out.println("world");
    }

    public static void main(String[] args) {

//        a("马云");

        Test2 test2=new Test2();
        test2.a();

    }

    public int a() {
        System.out.println("123");
        return 1;
    }

}
