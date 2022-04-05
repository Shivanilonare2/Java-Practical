package com.company;
import java.util.Scanner;

public class SAL_Fibbonacci_seres {
    public static void main(String[] args) {
        int i, n1, n2, n3, count=5;
        System.out.println("the fibonacci seres is given below");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        n1 = sc.nextInt();
        System.out.println("Enter the value of n2");
        n2= sc.nextInt();
        System.out.println(n1+n2);
        for(i=1; i<=count; ++i){
            n3 = n1 + n2;
            System.out.println(n2 + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
