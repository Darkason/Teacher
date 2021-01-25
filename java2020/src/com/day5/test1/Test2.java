package com.day5.test1;

/**
 * @auth admin
 * @date 2021/1/7
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
        User user = new User();
        User user2 = new User();

        //user.name="";

        System.out.println(user);
        System.out.println(user2);
    }

    public static void a() {
        User user = new User();
        user.setName("马蓉");
        user.setAge(20);
        user.setMoney(1000.3d);

        User user2 = new User("马蓉", 20);
        user2.setMoney(1000.3d);

        User user3 = new User("马蓉", 20, 3.1415d);

    }

    public void b(){
        int [] arr=new int[]{1,2,3};
        int [] arr2=new int[]{1,2,3};

        User user = new User();

//        Student.java
//        Student.class


    }

}
