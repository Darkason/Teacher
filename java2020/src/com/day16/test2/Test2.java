package com.day16.test2;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
//        System.out.println((char)fis.read());
//        System.out.println((char)fis.read());
//        System.out.println((char)fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());

//        int b;
//        while (true) {
//            b = fis.read();
//            if (b == -1) {
//                break;
//            }
//            System.out.println((char) b);
//        }

        // 10000字

        // 1024*2  2048  5000   1024*5
        //  xxxxx  24*60*60*1000

        byte[] b = new byte[2];
        int len;
        while (true) {
            len = fis.read(b);
//            System.out.println(len);
            if (len == -1) {
                break;
            }
            System.out.println(new String(b,0,len));
        }

//        while ((len = fis.read(b)) != -1) {
//            System.out.println(new String(b));
//        }

        fis.close();
    }
}
