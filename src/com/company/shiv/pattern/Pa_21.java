package com.company.shiv.pattern;

public class Pa_21 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if (j-i<-4 || j+i>12 || j+i<4 || j-i>4)
                {
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
