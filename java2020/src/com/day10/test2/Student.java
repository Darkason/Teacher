package com.day10.test2;

import com.day6.test3.Stu;

import java.util.Objects;

/**
 * @auth admin
 * @date 2021/1/14
 * @Description
 */
//public class Student implements Comparable<Student> {
public class Student {

    private String name;
    private Integer age;
    private Double money;

//    @Override
//    public int compareTo(Student o) {
////        return this.age-o.getAge();
//        if (o.getAge() == this.age) {
//            //说明年龄相同，在对工资排序
//            if (o.getMoney() > this.money) {
//                return -1;
//            } else if (o.getMoney() < this.money) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//        return o.getAge() - this.age;
//
//    }

    public Student() {
    }

    public Student(String name, Integer age, Double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(money, student.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, money);
    }

    //    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", money=" + money +
//                '}';
//    }
}
