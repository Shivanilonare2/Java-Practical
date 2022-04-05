package com.company.shiv.pattern;

public class Pa_11 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if(j-i<0 && j<4){
                    System.out.print(" ");
                }
                else if(j-i>0 && j>4){
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
