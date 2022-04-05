package com.company.shiv;
import java.util.Scanner;

public class SAL_count_sc {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int count=0;
        while(number>0){
            number= number/10;
            count++;
        }
        System.out.println(count);
    }
}
