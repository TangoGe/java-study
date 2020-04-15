package com.study.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * foreach 集合输出
 */
public class ForeachClassTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");

        for (String str: list) {
            System.out.println(str);
        }
    }
}
