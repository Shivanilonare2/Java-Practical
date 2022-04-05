package com.company;
import java.util.Scanner;

public class SAL_convertDAYS {
    public static void main(String[] args) {
        int m=1, year,week,day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Days");
        m= sc.nextInt();
        year = m/365;
  //      m= m%365;
        System.out.println("No of years: "+year);
        week =m/7;
 //       m=m%7;
        System.out.println("No of Week: "+week);
        day=m;
        System.out.println("No of Days: "+day);

    }
}
