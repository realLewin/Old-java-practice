package com.lewin.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
//-----------------------------------the magic of the listIterator cursor position--------------------------------------
//-------------------https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html------------------------------
    public static void main(String[] args) {

        LinkedList<Integer> testInteger = new LinkedList<Integer> () ;
        testInteger.add(1) ;
        testInteger.add(2) ;
        testInteger.add(3) ;
        testInteger.add(4) ;


        Scanner scanner = new Scanner(System.in);
        ListIterator intIter = testInteger.listIterator();
        boolean goingForward = true ;
        boolean flag = true ;
        while(flag){
            int userOption = scanner.nextInt() ;
            scanner.nextLine() ;

            if(userOption == 1){
                if(!goingForward && intIter.hasNext()){
                    intIter.next();
                    goingForward = true ;
                }
                if(intIter.hasNext()){
                    System.out.println(intIter.next());
                }
            }
            else if(userOption == 2){
                if(goingForward && intIter.hasPrevious()){
                    intIter.previous() ;
                    goingForward = false ;
                }
                if(intIter.hasPrevious()){
                    System.out.println(intIter.previous());
                }
            }
        }


















//        LinkedList<String>  linkedList = new LinkedList<String> () ;
//        linkedList.add("Los Angeles") ;
//        linkedList.add("chicago") ;
//        linkedList.add("seatle") ;
//
//        Iterator<String> iterator = linkedList.iterator() ;
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next()) ;
//        }


    }
}
