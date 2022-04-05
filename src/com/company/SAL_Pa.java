package com.company;

public class SAL_Pa {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++){
            for(int j=1; j<=n; j++){
                if(i+j>=6){
                    System.out.print("* ");
                }

                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
