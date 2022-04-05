package com.company.shiv;
import java.util.Scanner;
public class SAL_Hackerrank3 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                if(n<=9){
                    System.out.println(n+ "can be fitted in: ");
                }
                else{
                    System.out.println(n+ "can't be fitted anywhere");
                }
            }
        }
