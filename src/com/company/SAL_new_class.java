package com.company;


public class SAL_new_class {
    static void multiplication(int n){
        for(int i=10; i>=1; i--){
//            if(i%5!=0){
                System.out.println(n+" * "+i+" = "+n * i);
//            }
        }
    }
    public static void main(String[] args) {
        multiplication(7);

    }
}
