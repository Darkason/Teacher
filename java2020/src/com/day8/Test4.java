package com.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test4 {

    public static void main(String[] args) throws Exception {
        //谁调用，谁处理
//        try {
//            print();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        try {
//            print2();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//        System.out.println("世界你好");

        print();

    }

    public static void print2() throws ArithmeticException {
        System.out.println("hello");
        int i = 1 / 0;
        System.out.println("world");
    }

    public static void print() throws Exception {
        FileInputStream fis = new FileInputStream("d:\\a.txt");
    }

    public static void print3() throws Exception{
        int i = 1 / 0;
        FileInputStream fis = new FileInputStream("d:\\a.txt");
    }

}
