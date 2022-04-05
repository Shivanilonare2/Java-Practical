package com.company.shiv;

public class SAL_fact_while_loop {
    public static void main(String[] args) {
        int fact = 1;
        int n=6;
        do{
            fact= fact*n;
            System.out.println(fact);
            n++;
        }while(n>fact);
    }
}
