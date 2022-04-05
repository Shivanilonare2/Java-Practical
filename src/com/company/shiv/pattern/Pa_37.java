package com.company.shiv.pattern;

public class Pa_37 {
    public static void main(String[] args) {
        int count1 = 1;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if (j-i<=0){
                    System.out.print(count1++);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
