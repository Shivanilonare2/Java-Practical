package com.company;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non parameterised constructor");
    }

    Circle(int r){
        System.out.println("I am Circle Parameterised Constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am parameterised Cylinder");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }


}
public class SAL_Inheritence {
    public static void main(String[] args) {
        Circle obj = new Circle(12);
        System.out.println(obj.area());
        Cylinder a = new Cylinder(12, 4);
        System.out.println(a.volume());

    }
}
