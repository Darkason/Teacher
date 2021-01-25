package com.day10;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @auth admin
 * @date 2021/1/14
 * @Description
 */
public class Test3 {

    public static void main(String[] args) {
        //无序不可以重复
        HashSet<String> set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        set.remove("a");
//        for (String str : set) {
//            System.out.println(str);
//        }
        //迭代器
        Iterator<String> it = set.iterator();
        //hasNext()判断是否有下一个元素
        while (it.hasNext()) {
            //取出当前元素，并把指针往后移动一位
            String str = it.next();
//            String str2 = it.next();

            System.out.println(str);
        }

    }
}
