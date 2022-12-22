package com.company.map;

import java.util.HashMap;

public class HashMapResource {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(new Emp(1,"戴维",5000).getId(),new Emp(1,"戴维",5000).getName());
        System.out.println(hashMap);
    }
}
class Emp{
    private Integer id;
    private String name;
    private Integer salary;

    public Emp() {
    }

    public Emp(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
