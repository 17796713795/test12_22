package com.company.Thread1;

public class Test1 {
    public static void main(String[] args) {
        Thread tr1=new Thread("tr1");
        tr1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(tr1.getName());
        }

    }
}
