package com.day10.test3;

import com.day10.test2.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test2 {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap();
        //计算一个字符串中每个字符出现次数。
        String str = "cbaaabc";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                int count = map.get(chars[i]);
                map.put(chars[i], count + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        System.out.println(map);
    }

    public static void b() {
        Map<String, ArrayList<Student>> map = new HashMap<>();

        ArrayList<Student> class1 = new ArrayList<>();
        class1.add(new Student("杨广", 50, 1000D));
        class1.add(new Student("赵匡胤", 50, 1000D));

        ArrayList<Student> class2 = new ArrayList<>();
        class2.add(new Student("杨广2", 50, 1000D));
        class2.add(new Student("赵匡胤2", 50, 1000D));

        map.put("精英班", class1);
        map.put("火箭班", class2);

        Set<String> strings = map.keySet();
        for (String key : strings) {
            ArrayList<Student> students = map.get(key);

        }
    }

    public static void a() {
        Student s1 = new Student("杨广", 50, 1000D);
        Student s2 = new Student("杨广", 50, 1000D);
        Student s3 = new Student("赵匡胤", 30, 100D);

        HashMap<Student, String> map = new HashMap<>();
        map.put(s1, "隋朝");
        map.put(s2, "唐朝");
        map.put(s3, "宋朝");

        Set<Student> students = map.keySet();
        for (Student key : students) {
            System.out.println(map.get(key));
        }
    }
}
