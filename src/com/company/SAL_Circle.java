package com.company;
import java.util.Scanner;

public class SAL_Circle {
    public static void main(String[] args) {
        double r, pi, b;
        pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of r");
        r = sc.nextDouble();
        b = 2*pi*r;
        System.out.println("calculated value of the perimeter is");
        System.out.println(b);
    }
}
