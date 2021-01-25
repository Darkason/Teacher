package com.day7.test2;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public abstract class Animal {

    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void run();

    abstract void eat();

    void sleep() {

    }

    void swimming() {

    }
}
