package com.study.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 类 添加自定义类
 */
public class TreeSetCustomClass {
    public static void main(String[] args) throws Exception {
        Set<Person> personSet = new TreeSet<Person>();
        personSet.add(new Person("张三",20));
        personSet.add(new Person("张三",20));
        personSet.add(new Person("李四",20));
        personSet.add(new Person("王五",19));
        personSet.add(new Person("赵六",21));
        System.out.println(personSet);
    }

}


class Person implements Comparable<Person>{ // 实现Comparable接口比较大小
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "姓名："+this.name+",年龄："+this.age;
    }

    /**
     * 比较大小
     * @param o
     * @return
     */
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return  1;
        }else if(this.age < o.age) {
            return -1;
        }else{
            return this.name.compareTo(o.name);
        }
    }
}