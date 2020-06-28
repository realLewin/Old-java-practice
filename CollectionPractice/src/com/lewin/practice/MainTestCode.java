package com.lewin.practice;


import java.util.HashMap;
import java.util.Map;

public class MainTestCode {

    public static void main(String[] args) {
        //How to initialize a map :

        //for java version 8 :
        Map m = new HashMap<Integer , Integer>(){{
            put(1 , 1);
            put(2 , 2) ;
            put(3 , 3) ;
        }};
        System.out.println(m);

        //for java version 9 or higher :
        //this works for up to 10 elements :
        m = Map.of(
                1 , 1 ,
                2 , 2 ,
                3 , 3
        );
        System.out.println(m) ;
        //this works for any number of elements :
        m = Map.ofEntries(
                //how to do this ?
        );


    }


}
