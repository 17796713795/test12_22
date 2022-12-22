package com.company.why;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("戴维",18,69));
        list.add(new Student("张三",15,81));
        list.add(new Student("李四",13,93));
        list.add(new Student("王五",16,75));
        list.add(new Student("发发",17,76));
        //查询年龄大于16岁的学生
        findBYAge(list);
        System.out.println("----------------------");
        //查询成绩大于75的
        findBYScore(list);
        System.out.println("------------------");


        /**
         * 在java中提供一系列的函数式接口，用来接收后续传入的逻辑，但是对输入和输出有要求
         */
        //输入必须为string类型，输出必须为integer类型
        Function<String,Integer> f1=(str)->{return str.length();};
        System.out.println(f1.apply("asdasda"));
        //输出
        Supplier<String> s1=()->{return "aaaa6666";};
        Supplier<String> s2=()->"aaaa9999";
        System.out.println(s1.get());
        System.out.println(s2.get());

    }
    public static void findBYAge(ArrayList<Student> student){
        ArrayList<Student> list = new ArrayList<>();
        for(Student stu:student){
            if(stu.getAge()>16){
                list.add(stu);
            }
        }

        for(Student student1:list){
            System.out.println(student1);
        }

    }


    public static void findBYScore(ArrayList<Student> student){
        ArrayList<Student> list = new ArrayList<>();
        for(Student stu:student){
            if(stu.getScore()>75){
                list.add(stu);
            }
        }

        for(Student student1:list){
            System.out.println(student1);
        }

    }
}
