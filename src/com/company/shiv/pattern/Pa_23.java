package com.company.shiv.pattern;

public class Pa_23 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<20; j++){
                if(j-i>0 && j<5 || j+i>9 && j-i<10 || j>14 && j+i<19){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
