package com.day10.test2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test3 {

    public static void main(String[] args) {
        Student s1 = new Student("杨广", 50, 1000D);
        Student s2 = new Student("李渊", 40, 800D);
        Student s3 = new Student("赵匡胤", 30, 100D);
        Student s4 = new Student("忽必烈", 50, 1200D);
        Student s5 = new Student("朱元璋", 50, 10D);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o2.getAge() == o1.getAge()) {
                    if (o2.getMoney() > o1.getMoney()) {
                        return -1;
                    } else if (o2.getMoney() < o1.getMoney()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
                return o2.getAge() - o1.getAge();
            }
        };
        Collections.sort(list, comparator);

        Collections.sort(list, (Student o1, Student o2) -> {
            if (o2.getAge() == o1.getAge()) {
                if (o2.getMoney() > o1.getMoney()) {
                    return -1;
                } else if (o2.getMoney() < o1.getMoney()) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return o2.getAge() - o1.getAge();
        });

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
