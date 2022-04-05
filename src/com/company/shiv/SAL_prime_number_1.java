package com.company.shiv;
import java.util.Scanner;

public class SAL_prime_number_1 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        if(number%2!=0){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
