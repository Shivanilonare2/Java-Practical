package com.company.shiv;
import java.util.Scanner;

class Number{
    float l,m;
    public void shiv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of l ");
         l = sc.nextFloat();
        System.out.println("Enter the value of m ");
         m = sc.nextFloat();
    }
    public void addison(){
        float sum = l + m;
        System.out.println("The sum of the two numbers is " +sum);
    }
    public void subtraction(){
        float sub = l - m;
        System.out.println("The subtraction of the two numbers is " +sub);
    }
    public void multiplication(){
        float mul = l * m;
        System.out.println("The multiplication of the two numbers is " +mul);
    }
    public void division(){
        float div = l / m;
        System.out.println("The division of the two numbers is " +div);
    }
}
public class SAL_classobject {
    public static void main(String[] args) {
        Number abc = new Number();
        abc.shiv();
        abc.addison();
        abc.subtraction();
        abc.multiplication();
        abc.division();
    }
}
