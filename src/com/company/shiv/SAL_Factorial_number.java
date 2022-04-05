package com.company.shiv;
import java.util.Scanner;

public class SAL_Factorial_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        for(int i=number; i>0; i--){
            fact= fact*i;
        }
        System.out.println(fact);
    }
}
