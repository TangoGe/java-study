package com.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap类
 */
public class HashMapClassTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(3,"张三");
        map.put(null,"无名氏"); // key 可以保存为null
        map.put(3,"李四");  // Key 为重复的     value 将会被新的内容覆盖
        map.put(1,"王五");
        map.put(0,"赵六");
        System.out.println(map.get(3));
        System.out.println(map.get(null));

        Set<Integer> set = map.keySet(); // 取得所有的key 值输出
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
