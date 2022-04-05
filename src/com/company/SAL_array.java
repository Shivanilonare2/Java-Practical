package com.company;

public class SAL_array {
    public static void main(String[] args) {
        float[] marks = {45.5f, 64.8f, 63.4f, 99.2f, 100.0f};
 /*       float sum = 0;
       for(float element: marks){
            sum= sum+element;
       }
        System.out.println("The value of the sum is " +sum);

  */
        float num = 45.7f;
        boolean isInArray = true;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
            }
            if (isInArray) {
                System.out.println("the value is present in the array");
            } else {
                System.out.println("the value is not present in the array");
            }
        }
    }

