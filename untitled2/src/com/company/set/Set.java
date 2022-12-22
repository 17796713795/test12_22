package com.company.set;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("tom");
        set.add("jack");
        set.add("lmk");
        set.add("tom");
        set.add(null);
        set.add(null);
        for (Object o : set) {
            System.out.println(o);
        }

        set = new HashSet();
        set.add("jjking");//添加成功t
        set.add("jjking");//添加失败f，不可以有重复的元素
        set.add(new Dog("tom"));//添加成功（两个是不同的对象，只是名字相同都叫tom）
        set.add(new Dog("tom"));//添加成功
        System.out.println("set" + set);


    }

}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
