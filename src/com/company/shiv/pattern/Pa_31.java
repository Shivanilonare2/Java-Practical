package com.company.shiv.pattern;

public class Pa_31 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if(j-i<=0){
                    System.out.print(9-i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
