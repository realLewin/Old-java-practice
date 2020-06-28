package com.lewin.practice;

public class Dog implements IWalk {
    private int leg ;

    public Dog(int leg){
        this.leg = leg ;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    public int getLeg() {
        return leg;
    }

    public void walkSpeed() {
        System.out.println("Dog moves forward with speed 5 ") ;
    }
    public String legToWalk(int leg) {
        String info = "Dog have "+ leg +" legs . ";
        return info ;
    }



}
