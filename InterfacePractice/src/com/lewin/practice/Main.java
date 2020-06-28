package com.lewin.practice;

public class Main {

    public static void main(String[] args) {
        IWalk animal  ;
        animal = new Dog(4) ;
        animal.walkSpeed();
        String info = animal.legToWalk(5) ;
        System.out.println(info) ;

        animal = new Tiger() ;
        animal.walkSpeed();
        System.out.println(animal.legToWalk(3)) ;
    }
}
