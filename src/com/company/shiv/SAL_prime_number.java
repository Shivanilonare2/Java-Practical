package com.company.shiv;

public class SAL_prime_number {
    public static void main(String[] args) {
        for(int number=1; number<=20; number++){
            int counter=0;
            for(int i =2; i<number; i++){
                if(number%i==0){
        //            System.out.println(number+ " Not Prime");
                    counter++;
                    break;
                }
            }
            if(counter==0){
                System.out.println(number+ " Is prime");
            }
        }
    }
}
