package com.day7.test11;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Person {

    private String name;
    private Task task;

    public Person() {
    }

    public Person(Task task) {
        this.task = task;
    }

    public Person(String name) {
        this.name = name;
    }

    public void a() {
        task.eat();
    }


}
