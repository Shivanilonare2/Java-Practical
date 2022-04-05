package com.company;

public class SAL_totalmarksavg {
    public static void main(String[] args) {
        int s1,s2,s3,s4,s5,s6,total,avg;
        s1=65;
        s2=62;
        s3=78;
        s4=98;
        s5=45;
        s6=71;
        total=s1+s2+s3+s4+s5+s6;
        System.out.println("Total marks of subject:" +total);
        avg=(s1+s2+s3+s4+s5+s6)/6;
        System.out.println("avg of subject is:" +avg);

    }
}
