package com.day10.test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        // key value 键值对
        //无序
        // key不能重复，value可以重复
        //key可以null
        //key value可以同时null
        HashMap<String, String> map = new HashMap<>();
        map.put("黄晓明", "杨颖");
        map.put("王宝强", "马蓉");
        map.put("杨过", "小龙女");
        map.put("杨过2", "小龙女2");
        map.put("杨过3", "小龙女2");
        map.put("", "李若彤");
//        map.put(null, "刘亦菲");
        map.put("古天乐", null);
        map.put(null, null);

        //获取所有key的集合
        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println("key:" + key + ",value:" + map.get(key));
//        }

//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()){
//            String key=it.next();
//            System.out.println("key:" + key + ",value:" + map.get(key));
//        }

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + ",value:" + map.get(key));
        }

    }
}
