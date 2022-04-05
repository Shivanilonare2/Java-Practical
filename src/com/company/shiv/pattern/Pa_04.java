package com.company.shiv.pattern;

public class Pa_04 {
    public static void main(String[] args) {
        for (int i=0; i<9; i++){
            for (int j=0; j<5; j++){
                if(i-j>=0 && i+j<=8){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
