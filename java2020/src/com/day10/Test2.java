package com.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auth admin
 * @date 2021/1/14
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
//        list.addFirst("亚索");
//        list.addFirst("石头人");
//        list.addFirst("儿童劫");

        list.add("亚索");
        list.add("石头人");
        list.add("儿童劫");
        list.add(1, "小学僧");

        System.out.println("pop:"+list.pop());

//        list.remove(0);
//        list.remove("儿童劫");

//        System.out.println(list.getFirst());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void a() {
        //有序可以重复
        List<String> list = new ArrayList();
        list.add("如花");
        list.add("如花");
        list.add("如花");
        list.add("潘金莲");
        list.add("林黛玉");
//        list.add(1, "金莲");
//        list.remove(2);

        //复制式添加
        list.set(3, "薛宝钗");

        Object[] objects = list.toArray();

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //增强for  加强
        for (String str : list) {
            System.out.println(str);
        }
    }

}
