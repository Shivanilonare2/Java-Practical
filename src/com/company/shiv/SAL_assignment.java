package com.company.shiv;


public class SAL_assignment {
    public static void main(String[] args) {
        int p=0;
        int y=0;
        int py=0;
        for(int number= 33; number<=999; number++){
            if(number%3==0){
                System.out.println(number+ " PINK");
                p++;
            }
            if(number%5==0){
                System.out.println(number+ " YELLOW");
                y++;
            }
            if(number%3==0 && number%5==0){
                System.out.println(number+ " PINK & YELLOW");
                py++;
            }
            else{
                System.out.println(number);
            }
        }
        System.out.println(p+ " PINK");
        System.out.println(y+ " YELLOW");
        System.out.println(py+ " PINK & YELLOW");
    }
}
