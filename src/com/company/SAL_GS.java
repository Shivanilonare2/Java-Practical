package com.company;

class Shivani{
    private String adds;
    private String job;

    public Shivani() {
        System.out.println("Hey my name is Shivani");
    }
    public String getadds(){
        return adds;
    }
    public void setadds(){
        this.adds="Budhawari peth";
    }
    public String getjob(){
        return job;
    }
    public void setjob(){
        this.job= "Software Developer";
    }
}
public class SAL_GS {
    public static void main(String[] args) {
        Shivani obj = new Shivani();
        obj.setadds();
        String adds = obj.getadds();
        System.out.print("My adds is " );
        System.out.println(adds);
        obj.setjob();
        String job = obj.getjob();
        System.out.print("right now i am working as a ");
        System.out.println(job);
    }
}
