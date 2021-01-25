package com.day16.test3;

import java.io.*;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
//        FileOutputStream fos=new FileOutputStream("d:\\a.txt");
//        BufferedOutputStream bos=new BufferedOutputStream(fos);
//        bos.close();

//        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\a.txt"));
//        byte [] b=new byte[2];
//        int len;
//        while ((len=bis.read(b))!=-1){
//            System.out.println(new String(b,0,len));
//        }
//        bis.close();

        b();
    }

    public static void b() {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("D:\\搜狗高速下载\\AxureRP-Setup-3395.exe"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\AxureRP-Setup-3395.exe"));
            byte[] b = new byte[1024 * 5];
            int len;
            while (true) {
                len = bis.read(b);
                if (len == -1) {
                    break;
                }
                bos.write(b, 0, len);
                bos.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:" + (end - start) + " 毫秒");

    }


    public static void a() throws Exception {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
//        try {
//            FileInputStream fis = new FileInputStream("D:\\搜狗高速下载\\AxureRP-Setup-3395.exe");
//            FileOutputStream fos = new FileOutputStream("D:\\AxureRP-Setup-3395.exe");
//            // 读写数据
//            int b;
//            while ((b = fis.read()) != -1) {
//                fos.write(b);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:" + (end - start) + " 毫秒");

        // 记录开始时间
        long start2 = System.currentTimeMillis();
        // 创建流对象
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\搜狗高速下载\\AxureRP-Setup-3395.exe"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:\\AxureRP-Setup-3395.exe"));
            // 读写数据
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 记录结束时间
        long end2 = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:" + (end2 - start2) + " 毫秒");


    }


}
