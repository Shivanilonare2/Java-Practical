package com.company.shiv.pattern;

public class Pa_38 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for (int j=0; j<5; j++){
                if(j-i<=0 && j+i<=8){
                    System.out.print(j+1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
