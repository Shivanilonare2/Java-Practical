package com.company;

public class SAL_12_pattern {
    public static void main(String[] args) {
//        int n = 5;
//        for(int i=1, p=0; i<=n; i++, p+=2){
//            for(int j=1; j<=i; j++){
//                System.out.print(p+ " ");
//            }
//        int n = 5;
//        for(int i=1, p=0; i<=n; i++, p+=2){
//            for(int j=1; j<=i; j++) {
//                if (i%2==0){
//                    System.out.print("2");
//                }
//                else{
//                    System.out.print("1");
//                }
//            }
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            int p=1;
//            for(int j=1; j<=i; j++) {
//                System.out.print(p++ + " ");
        int n = 5;
        for(int i=1; i<=n; i++){
            int p=1;
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++) {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }

    }
}
