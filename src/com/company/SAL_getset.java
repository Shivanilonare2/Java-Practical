package com.company;

class Cylinder1 {
    private int r;
    private int h;

    Cylinder1() {
        System.out.println("I am the Cylinder");
    }

    public int getheight() {
        return h;
    }

    public void setheight() {
        this.h=45;
    }

    public int getradius() {
        return r;
    }

    public void setradius() {
        this.r=67;
    }
}
    public class SAL_getset {
        public static void main(String[] args) {
            Cylinder1 myCylinder = new Cylinder1();
            myCylinder.setheight();
            int h = myCylinder.getheight();
            System.out.println(h);
            myCylinder.setradius();
            int r = myCylinder.getradius();
            System.out.println(r);

        }
    }
