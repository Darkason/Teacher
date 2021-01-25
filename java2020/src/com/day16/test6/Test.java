package com.day16.test6;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @auth admin
 * @date 2021/1/23
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        Properties p = new Properties();
////        p.setProperty("name", "薛宝钗");
////        p.setProperty("age", "20");
////        p.setProperty("sex", "0");

//        System.out.println(p.getProperty("name"));
//        System.out.println(p.getProperty("age"));

//        Set<String> keys = p.stringPropertyNames();
//        for (String key : keys) {
////            System.out.println(key);
////            System.out.println(p.getProperty(key));
////        }

//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        keys.stream().forEach(n -> {
//            System.out.println(p.getProperty(n));
//        });

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("src\\p.txt");
        p.load(fis);

        p.stringPropertyNames().stream().forEach(n -> {
            System.out.println("key:" + n + ",value:" + p.getProperty(n));
        });

    }
}
