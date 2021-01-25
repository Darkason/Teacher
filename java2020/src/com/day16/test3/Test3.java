package com.day16.test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\a.txt"));
        bw.write("团战可以输");
//        bw.write("\r\n");
        bw.newLine();
        bw.write("亚索必须死");

        bw.flush();
        bw.close();
    }

    public static void b() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("d:\\a.txt"));
        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
    }

    public static void a() throws Exception {
        long start = System.currentTimeMillis();
        FileReader fr = new FileReader("D:\\搜狗高速下载\\AxureRP-Setup-3395.exe");
        BufferedReader br = new BufferedReader(fr);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\AxureRP-Setup-3395.exe"));

        char[] c = new char[1024 * 5];
        int len;
        while ((len = br.read(c)) != -1) {
            bw.write(c, 0, len);
        }
        bw.flush();
        bw.close();
        br.close();
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:" + (end - start) + " 毫秒");
    }
}
