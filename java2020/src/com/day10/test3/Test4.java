package com.day10.test3;

import javax.rmi.CORBA.StubDelegate;
import java.util.HashSet;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test4 {

    public static void main(String[] args) {
        Student s1 = new Student("马云", 20);
        Student s2 = new Student("马云", 20);

        HashSet<Student> set = new HashSet<>();
        //s1 =com.day10.test3.Student@4b6995df    1000
        //s2 =com.day10.test3.Student@5474c6c      2000

        //  s1.hashCode();  com.day10.test3.Student@4b6995df .hashCode()
        //  "马云20".hashCode()  500

        //  s1.equals();

        //s2.equals(s1)

        set.add(s1);
        set.add(s2);

        System.out.println(set);

        //重写hashCode一定要重写equals()
    }
}
