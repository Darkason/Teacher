package com.day16.test;

import java.io.File;
import java.util.Date;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
//        print();
//        int resutl = sum(5);
//        System.out.println(resutl);

        // !5=5*4*3*2*1
//        System.out.println(jieChen(5));
        File file = new File("D:\\java2020");
        printFile(file);
    }


    public static void printFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".java")) {
//                if (f.getName().endsWith(".java")) {
                    System.out.println("是java文件：" + f.getName());
//                }
            } else {
                printFile(f);
            }
        }
    }


    public static int jieChen(int i) {
        if (i <= 1) {
            return 1;
        }
        int result = i * jieChen(--i);
//        int result = jieChen(--i) *i ;
        return result;
    }

    public static int sum(int i) {
        if (i <= 0) {
            return 0;
        }
        return sum(i - 1) + i;

        // return sum(5-1) + 5;

        // return sum(4) + 5;
        // return sum(3) +4+ 5;
        // return sum(2)+3 +4+ 5;
        // return sum(1) +2 +3 +4+ 5;
        // return sum(0) +1 +2 +3 +4+ 5;
        // return 0 +1 +2 +3 +4+ 5;
    }

    public static void b(int i) {
        if (i >= 500) {
            return;
        }
        System.out.println(i);
        i++;
        b(i);
    }

    public static void print() {
        System.out.println(new Date().getTime());
        print();
    }

}
