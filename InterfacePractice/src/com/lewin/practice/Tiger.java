package com.lewin.practice;

public class Tiger implements IWalk {
    private int leg ;
    public Tiger(){
        this(4) ;
    }
    public Tiger(int leg) {
        this.leg = leg ;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void walkSpeed(){
        System.out.println("Tiger moves back with speed 10 . ") ;
    }
    public String legToWalk(int leg){
        String info = "Tiger have " + leg + " legs" ;
        return info ;
    }
}
