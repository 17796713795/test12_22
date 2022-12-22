package com.company.list;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add("hello");
        list1.add("tom");
        list1.add("xiao lan");
        list1.add("大黄");
        list1.add("小黑");
        list1.add("瑶一瑶");
        list1.add("lili");
        list1.add("Tom");
        list1.add("tom");
        list1.add("小绿");
        System.out.println("原本list："+list1);
        list1.add(2,"韩顺平教育");
        System.out.println(list1);
        Object a=list1.get(5);
        System.out.println("第五个元素为："+a);
        //删除第六个元素
        list1.remove(6);
        //修改第七个元素
        list1.set(7,"777");
        System.out.println(list1);
        for (Object o : list1) {
            System.out.println("遍历"+o);
        }

        //lamdba表达式遍历
        list1.forEach(e-> System.out.println(e));

    }

}
