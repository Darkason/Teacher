package com.day8;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test2 {

    // return break continue

    public static void main(String[] args) {

        try {
            System.out.println("hello");
//            int a = 1 / 0;
            System.out.println("world");
            //System.exit(0);
            System.out.println("www.baidu.com");
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("世界你好");
            return;
        } finally {
            //无论如何都会执行
            System.out.println("今天一定要放假，我说的，耶稣也留不住");
        }
    }
}
