package com.study.string;

public class MyTest {

    public static void main(String[] args) {
        //String 类共享式设计
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello";

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//true
        System.out.println(str2==str3);//true
    }
}
