package com.company;

public class SAL_arraysorted {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr= {1, 2, 3, 4, 5, 34, 67};
        for (int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is Sorted");
        }
        else{
            System.out.println("The array is not Sorted");
        }
    }
}
