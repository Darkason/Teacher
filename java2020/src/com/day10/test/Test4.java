package com.day10.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @auth admin
 * @date 2021/1/14
 * @Description
 */
public class Test4 {

    public static void main(String[] args) {
        c();
    }

    public static void c() {
        Student s1 = new Student("秦始皇", 40);
        Student s2 = new Student("汉武帝", 30);
        Student s3 = new Student("司马炎", 50);

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        HashSet<Student> set2 = new HashSet<>();
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);

        ArrayList<HashSet<Student>> list = new ArrayList<>();
        list.add(set);
        list.add(set2);

    }

    public static void b() {
        Student s1 = new Student("秦始皇", 40);
        Student s2 = new Student("汉武帝", 30);
        Student s3 = new Student("司马炎", 50);

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
//        for (){}

        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu);
        }

    }


    public static void a() {
        Student s1 = new Student("秦始皇", 40);
        Student s2 = new Student("汉武帝", 30);
        Student s3 = new Student("司马炎", 50);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        for (Student stu : list) {
//            System.out.println(stu);
//        }

        ArrayList<ArrayList<Student>> list2 = new ArrayList<>();
        list2.add(list);
        list2.add(list);
        for (int i = 0; i < list2.size(); i++) {
            ArrayList<Student> students = list2.get(i);
            for (int j = 0; j < students.size(); j++) {
                System.out.println(students.get(j).toString());
            }
        }
    }

}
