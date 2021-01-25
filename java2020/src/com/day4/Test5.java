package com.day4;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test5 {

    public static void main(String[] args) {
        //print();

        print("亚索", 20);

        print(20, "亚索");

    }

    public static void print() {
        System.out.println("hello");
    }

    public static int print(String name) {
        System.out.println(name);
        return 1;
    }

    String print(int name) {
        System.out.println(name);
        return "hello";
    }

    public static void print(String name, int age) {
        System.out.println(name + "," + age);
    }

//    public static void print(String name, int money) {
//        System.out.println(name + "," + money);
//    }

    public static void print(int age, String name) {
        System.out.println(name + "," + age);
    }

    public static void print2(String name, int age) {
        System.out.println(name + "," + age);
    }

}
