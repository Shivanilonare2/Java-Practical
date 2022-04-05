package com.company;
import java.util.Scanner;

public class SAL_oddevennew {
    public static void main(String[] args) {
        int a;
        System.out.println("Odd or even number problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        if (a%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
