package com.lewin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<> () ;

        items.add(1) ;
        items.add(19) ;
        items.add(23) ;

        for(int i : items){
            System.out.println(i*3) ;
        }
    }
}
