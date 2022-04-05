package com.company;

interface bicycle{
    int applybrake(int decrement);
    int speedUp(int increment);
}
interface Puncher{
    int money(int m);
    int time(int t);
}
class AvonCycle implements bicycle, Puncher{
    int speed = 7;
    public AvonCycle() {
        System.out.println("I am riding Cycle");
    }
    public int applybrake(int decrement){
        speed= speed-decrement;
        return speed;
    }
    public int speedUp(int increment){
        speed= speed+increment;
            return speed;
    }
    public int money(int m){
        return m;
    }
    public int time(int t){
        return t;
    }
}
public class SAL_interface {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        int speed=7;
        System.out.print("The speed of my cycle is ");
        System.out.println(speed);
        System.out.print("While the road is clear the speed is ");
        System.out.println(obj.speedUp(2));
        System.out.print("When ther is a breaker the speed becomes ");
        System.out.println(obj.applybrake(1));
        System.out.println("While Puncher");
        System.out.print("The money required to repair the puncher is ");
        System.out.println(obj.money(45));
        System.out.print("time for puncher repair in minutes ");
        System.out.println(obj.time(30));

    }
}
