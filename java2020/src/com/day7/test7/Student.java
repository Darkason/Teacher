package com.day7.test7;

import com.day7.test1.Person;
import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */

//单继承，多实现

//接口可以多实现
public class Student extends Teacher implements Coder, Cooker {

    public void gaming() {

    }

    @Override
    public void coding() {

    }

    @Override
    public void cooke() {

    }

    @Override
    public void eat() {
        super.eat();
    }
}
