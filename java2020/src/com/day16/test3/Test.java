package com.day16.test3;

import javax.annotation.processing.Filer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("D:\\搜狗高速下载\\elasticsearch-5.6.16.zip");
            fw = new FileWriter("e:\\elasticsearch-5.6.16.zip");

            int len;
            char[] c = new char[1024];
            while (true) {
                len = fr.read(c);
                if (len == -1) {
                    break;
                }
                fw.write(c, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.flush();
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void b() throws Exception {
        FileWriter fw = new FileWriter("d:\\a.txt");
//        fw.write(98);
//        fw.write("团战可以输");
//        fw.write("团战可以输,提莫必须死".toCharArray());
//        char[] chars = "abcd".toCharArray();
//        fw.write(chars, 0, 2);

        fw.write("犯我中华者");
        fw.write("\r\n");
        fw.write("虽远必诛");
        fw.flush();
        fw.close();
    }

    public static void a() throws Exception {
        FileReader fr = new FileReader("D:\\a.txt");

        int len;
        char[] c = new char[2];
        while (true) {
            //返回读到的字符长度
            //把读到的字符保存到数组c中
            len = fr.read(c);
            if (len == -1) {
                break;
            }
            System.out.println(new String(c, 0, len));
        }
        fr.close();
    }
}
