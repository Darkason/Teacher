package com.day7.test10;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test {
    public static void main(String[] args) {

        // new 一个接口必须重写接口里面的所有的抽象方法
        //匿名，没有名字
        //局部匿名内部类
        //new 一个接口返回的是子实现类，相当于User implement Swim
        Swim swim = new Swim() {
            @Override
            public void swimming() {
                System.out.println("狗刨式游泳");
            }
        };
        swim.swimming();

        new Swim() {
            @Override
            public void swimming() {
                System.out.println("花样式");
            }
        }.swimming();

    }

}
