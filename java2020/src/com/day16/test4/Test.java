package com.day16.test4;

import javax.annotation.processing.Filer;
import java.io.*;

/**
 * @auth admin
 * @date 2021/1/23
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {
        d();
    }

    public static void d() throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\b.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\c.txt"),"UTF8");
        int len;
        char[] c = new char[32];
        while ((len = isr.read(c)) != -1) {
            osw.write(c, 0, len);
        }
        osw.flush();
        osw.close();
        isr.close();

    }

    public static void c() throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\a.txt"));
        osw.write("团战可以输");
        osw.flush();
        osw.close();
    }


    public static void b() throws Exception {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\b.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\b.txt"), "GBK");
        System.out.println((char) isr.read());
        System.out.println((char) isr.read());
        System.out.println((char) isr.read());
        System.out.println((char) isr.read());
        System.out.println((char) isr.read());

        System.out.println(isr.read());
        System.out.println(isr.read());
        System.out.println((char) isr.read());
        System.out.println((char) isr.read());
        System.out.println((char) isr.read());

        System.out.println((char) isr.read());
        System.out.println((char) isr.read());
        System.out.println(isr.read());
        System.out.println(isr.read());

//        char[] c = new char[10];
//        int len;
//        while ((len = isr.read(c)) != -1) {
//            System.out.println(new String(c, 0, len));
//        }
    }

    public static void a() throws Exception {
        FileReader fr = new FileReader("d:\\b.txt");
        char[] c = new char[10];
        int len;
        while ((len = fr.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
        fr.close();
    }

}
