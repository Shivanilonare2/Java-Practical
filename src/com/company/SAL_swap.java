package com.company;

public class SAL_swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a="+a+"  "+"b="+b); //concatigation in java
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("a="+a+"  "+"b="+b);
//        System.out.println(a);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"  "+"b="+b);
        System.out.println(a);
    }
}
