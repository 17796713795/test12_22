package com.company.list;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Dog("Tom",19));
        list.add(new Dog("Tom",19));
        list.add(new Dog("lisha",26));
        System.out.println(list);
    }
}
class Dog{
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name) && age.equals(dog.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
