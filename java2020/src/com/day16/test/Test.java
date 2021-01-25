package com.day16.test;

import java.io.File;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        File file2=new File("D:\\a","a.txt");
//        File parent=new File("D:\\a");
//        File son=new File(parent,"a.txt");

        File file = new File("D:\\a\\a.txt");
//        System.out.println("获取文件名称："+file.getName());
//        System.out.println("获取文件长度："+file.length());
//        System.out.println("File转换为路径名字符串："+file.getPath());
//        System.out.println("File的绝对路径名字符串。："+file.getAbsolutePath());

        File file2 = new File("java2020.txt");
//        System.out.println(file2.getAbsolutePath());
//        System.out.println(file2.getPath());

        File file3 = new File("D:\\a\\a.txt");
        File file4 = new File("D:\\a");
//        System.out.println(file3.exists());
//        System.out.println(file4.isDirectory());
//        System.out.println(file4.isFile());

        File file5 = new File("D:\\a");
//        System.out.println(file5.createNewFile());
//        file5.delete();

        File file6 = new File("D:\\a\\c");
//        file6.mkdir();
//        file6.mkdirs();

        File file7 = new File("D:\\a");
//        String[] files = file7.list();
//////        for (String str:files){
//////            System.out.println(str);
//////        }

        File[] files = file7.listFiles();
        for (File f:files){
           if(f.isFile()){
               System.out.println(f+"是文件");
           }else{
               File[] files1 = f.listFiles();

           }
        }
    }

}
