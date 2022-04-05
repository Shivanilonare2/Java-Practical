package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Hi");
    }
    public void sayHi(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void Child1(){
        System.out.println("hello");
    }
}
public class SAL_Abstract_Class {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();
    }
}
