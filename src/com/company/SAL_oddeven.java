package com.company;
import java.util.Scanner;

public class SAL_oddeven {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        a= sc.nextInt();
        if(a%2==0){
            System.out.println("given number is even");
        }
        else{
            System.out.println("given number is odd");
        }
    }
}
