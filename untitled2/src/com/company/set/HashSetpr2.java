package com.company.set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetpr2 {
    //hashset练习题
    //创建一个对象，name和age相同时不能添加
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new people("tome",18));
        set.add(new people("join",28));
        set.add(new people("tome",18));
        System.out.println(set);
    }
}
class people{
    private String name;
    private Integer age;


    public people() {
    }

    public people(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        people people = (people) o;
        return Objects.equals(name, people.name) && Objects.equals(age, people.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
