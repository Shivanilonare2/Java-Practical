package com.company;
import java.util.Scanner;

public class SAL_Maxamongthree {
    public static void main(String[] args) {
        int i, n, max;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number");
        n= sc.nextInt();
        a=new int[n];
        System.out.println("enter the number");
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("the largest number is ");
    }
}
