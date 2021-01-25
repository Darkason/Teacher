package com.day4;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        //实参 实际参数
        int a = squer(10);

        int b = 10 * 10;

        int c = 100 * 100;
    }

    //形参  形式参数
    public static void squer2(int a) {

    }

    public static int squer(int a) {
        int b = a * a;
        return b;
    }

    public void getBigger(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        // return ;
    }

}
