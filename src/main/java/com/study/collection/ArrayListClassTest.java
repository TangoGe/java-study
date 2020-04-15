package com.study.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList<E>
 */
public class ArrayListClassTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+",");
        }
    }
}
