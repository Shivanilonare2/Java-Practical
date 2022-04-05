package com.company.shiv;
import java.io.*;
import java.util.*;
import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int j=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                j=j+i;
            }

        }
        return j;
    }
}
public class SAL_Hackerrank2 {
    public static void main(String[] args) {
        MyCalculator ab = new MyCalculator();
        ab.divisor_sum(9);
    }
}
