package com.lewin.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMain {

    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {

        //mapMethodTest() ;

        //fileWriterBasic() ;

        //fileWriterUseFinallyBlock() ;

//        try{
//            fileWriterWithThrowsMethod() ;
//        }catch(IOException e) {
//            e.printStackTrace();
//        }

        //fileWriterWithTryWithResource() ;

        fileFormatTest() ;

        //fileReaderTest() ;



    }
    //----------------------------------------------------------------------------------------------------
    private static void mapMethodTest() {
        Map<Integer , String> tempMap = new HashMap<>() ;
        tempMap.put(1 , "a") ;
        tempMap.put(2 , "s") ;
        tempMap.put(3 , "d") ;
        System.out.println(tempMap.keySet());
        System.out.println(tempMap.values());;
    }
    //----------------------------------------------------------------------------------------------------
    private static void fileWriterBasic(){
        FileWriter tempFW = null ;
        try{
            tempFW = new FileWriter("TestMain.txt" ) ;
            System.out.println("what you want to write ? ");
            String userString = scanner.nextLine() ;
            tempFW.write(userString) ;

            if(tempFW != null) {
                tempFW.close() ;
            }
        }catch(IOException e) {
            e.printStackTrace() ;
        }
    }
    //----------------------------------------------------------------------------------------------------
    private static void fileWriterUseFinallyBlock(){
        FileWriter tempFW = null ;
        try{
            tempFW = new FileWriter("TestMain.txt") ;
            System.out.println("what you want to write ? ");
            String userString = scanner.nextLine() ;
            tempFW.write(userString) ;
        }catch(IOException e){
            e.printStackTrace() ;
        }finally{
            if(tempFW != null) {
                try {
                    tempFW.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    //----------------------------------------------------------------------------------------------------
    //compare this one with the method fileWriterUseFinallyBlock() . the catch block isn't necessary .
    private static void fileWriterWithThrowsMethod() throws IOException{

        FileWriter tempFW = null ;
        try{
            tempFW = new FileWriter("TestMain.txt") ;
            System.out.println("what you want to write ? ");
            String userString = scanner.nextLine() ;
            tempFW.write(userString) ;
        }finally{
            if(tempFW != null) {
                    tempFW.close() ;
            }
        }
    }

    //----------------------------------------------------------------------------------------------------
    //Try-with-resource method ensure that each resource is closed at the end of the statement .
    //So don't need finally block to close the resource .
    private static void fileWriterWithTryWithResource() {
        try(FileWriter tempFW = new FileWriter("TestMain.txt")){
            System.out.println("what you want to write ? ");
            String userString = scanner.nextLine() ;
            tempFW.write(userString) ;
        }catch(IOException e){
            e.printStackTrace() ;
        }
    }
//----------------------------------------------------------------------------------------------------
    private static void fileFormatTest(){
        try(FileWriter tempFW = new FileWriter("FileFormatTest.txt")){
            String testString = "I am a String , the number is 1 , and how about the next line there\n\t\"a tab ahead me , another number is 2 ." ;
            tempFW.write(testString) ;
        }catch(IOException e){
            e.printStackTrace();
        }
        try(Scanner tempFR = new Scanner(new FileReader("FileFormatTest.txt"))) {
            if(tempFR.hasNextLine()){
                String tempString1 = tempFR.next() ;
                String tempString2 = tempFR.next() ;
                String tempString3 = tempFR.nextLine() ;
                System.out.println(tempString1) ;
                System.out.println(tempString2);
                System.out.println(tempString3);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }



//----------------------------------------------------------------------------------------------------
    private static void fileReaderTest() {
    }





















}



















