package com.company.shiv.pattern;

public class Pa_40 {
    public static void main(String[] args) {
        for (int i=0; i<9; i++){
            for (int j=0; j<5; j++){
                if(j-i<0 && j+i<8){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j+4-3);
                }
            }
            System.out.println();
        }
    }
}