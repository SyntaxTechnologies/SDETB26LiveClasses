package org.example.class9;

public  class Calculator {
    final static double PI=3.14;

    void add(int a,int b){
        System.out.println(a+b);
    }
}


class Calculator2026 extends Calculator{
    void add(int a,int b){
        System.out.println(a+b);
        System.out.println(a);
        System.out.println(b);
        System.out.println("Updated method");
    }
}

