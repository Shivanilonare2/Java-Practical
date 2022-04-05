package com.company.shiv;
import java.util.*;
import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    void shiv(){
        Scanner sc = new Scanner(System.in);
        title = sc.nextLine();
    }

    void setTitle(String s){
        title = s;
        System.out.println("The title is: " +s);
    }
}

public class SAL_Hackerrank1 {
    public static void main(String[] args) {
        MyBook abc = new MyBook();
        abc.shiv();
        abc.setTitle(abc.title);
    }

}
