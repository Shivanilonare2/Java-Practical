package com.company.shiv.pattern;

public class Pa_44 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for (int j=0; j<5; j++){
                if(j-i<=0 && j+i<=8){
                    if(j<5){
                        System.out.print((char)(j+65));
                    }
                    else{
                        System.out.print((char)(73-j));
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
