package com.company;
import java.util.Scanner;

public class SAL_01_Exercise {
    public static void main(String[] args) {
        System.out.println("all subjects marks is");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks obtained in a");
        int a = sc.nextByte();
        System.out.println("Enter marks obtained in b");
        int b = sc.nextByte();
        System.out.println("Enter marks obtained in c");
        int c = sc.nextByte();
        System.out.println("Enter marks obtained in d");
        int d = sc.nextByte();
        System.out.println("Enter marks obtained in e");
        int e = sc.nextByte();
        float f = (a+b+c+d+e)/5.0f;
        System.out.println("enter f percentage");
        System.out.println(f);
    }
}
