package com.day10;

import com.day7.test7.Cooker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add("石破天");
        collection.add(true);
        collection.add(0.5);

        System.out.println("元素个数：" + collection.size());

        collection.remove("石破天");
        System.out.println(collection.contains("石破天"));

        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //泛型
//        Collection<String> collection1=new ArrayList<String>();
        Collection<String> collection1 = new ArrayList();
        collection1.add("阿青");
//        collection1.add(0.5);
//        collection1.add(true);


    }

}
