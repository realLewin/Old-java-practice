package com.lewin.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//stream is a sequence of data .
//input stream : reads data from source .
//output stream : writes data to destination .


    private static Scanner scanner = new Scanner(System.in) ;
    private static Locations locations = new Locations() ;
    private static Map<String , Integer> exits = new HashMap<>() ;

    private static Map<String , String> longMove = new HashMap<String , String>() ;

    public static void main(String[] args) {

        longMove.put("QUIT" , "Q") ;
        longMove.put("TOP" , "T") ;
        longMove.put("MIDDLE" , "M") ;
        longMove.put("LEFT" , "L") ;
        longMove.put("RIGHT" , "R") ;
        longMove.put("BOTTOM" , "B") ;

        int loc = 1 ;
        while(true){
            System.out.println(locations.get(loc).getDescription()) ;

            if(locations.get(loc).getLocationID() == 0) {
                break ;
            }

            exits = locations.get(loc).getExits() ;

            System.out.println("Available move is/are : ");
            for(String exit : exits.keySet()){
                System.out.print(exit + " , ");
            }
            System.out.println();

            String move = scanner.nextLine().toUpperCase() ;
            if(move.length() > 1){
                String[] moves = move.split(" ") ;
                for(String m : moves){
                    if(longMove.containsKey(m))
                    {
                        move = longMove.get(m) ;
                        break ;//notice this !
                    }
                }
            }

            if(locations.get(loc).getExits().containsKey(move)) {
                loc = locations.get(loc).getExits().get(move) ;
            }else{
                System.out.println("You can't go to there ...");
            }

        }

        scanner.close() ;

    }


}
