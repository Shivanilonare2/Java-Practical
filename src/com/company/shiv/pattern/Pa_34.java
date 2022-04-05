package com.company.shiv.pattern;

public class Pa_34 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(j+i>=4){
                    System.out.print(j+i-3 +" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
