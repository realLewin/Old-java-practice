package com.lewin.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in) ;
    private static boolean quit = false ;
    private static GroceryList userList = new GroceryList() ;

    public static void main(String[] args) {
        //1 printOption ; 2 showGroceryList ; 3 addItem; 4 modifyItem; 5 removeItem;6 searchItem;7 copyArrayList;8 quitApp
        while(!quit){
            printOption() ;
            int userOption = scanner.nextInt() ;
            scanner.nextLine() ;
            System.out.println(userOption) ;
            switch(userOption){
                case 1 :
                    printOption() ;
                    break ;
                case 2 :
                    showGroceryList() ;
                    break ;
                case 3 :
                    addItem() ;
                    break ;
                case 4 :
                    modifyItem() ;
                    break ;
                case 5 :
                    removeItem() ;
                    break ;
                case 6 :
                    searchItem() ;
                    break ;
                case 7 :
                    copyArrayList() ;
                    break ;
                case 8 :
                    quitApp() ;
                    break ;
                default:
                    System.out.println("Sorry , we meet some problem , you need try again .") ;
                    break ;
            }
        }
    }

    private static void printOption(){
        System.out.println("Please choose your option : \n" +
                "\t1 . print selectable options .\n" +
                "\t2 . show what's in my grocery list .\n" +
                "\t3 . add item to my grocery list .\n" +
                "\t4 . modify item in my grocery list .\n" +
                "\t5 . remove item form my grocery list .\n" +
                "\t6 . search item in my grocery list .\n" +
                "\t7 . do copy process .\n" +
                "\t8 . quit app .\n");
    }

    private static void showGroceryList(){
        userList.printList() ;
    }

    private static void addItem(){
        System.out.println("what item do your want to add ? ");
        String userItem = scanner.nextLine() ;
        if(userList.addItem(userItem)) {
            System.out.println("You have add " + userItem +" in your list ! ");
        }else{
            System.out.println("Sorry , we meet some problem , you need try again .");
        }
    }

    private static void modifyItem(){
        System.out.println("what's your modified item ?");
        String oldItem = scanner.nextLine() ;
        System.out.println("what you want change this item to ? ");
        String newItem = scanner.nextLine() ;
        if(userList.modifyItem(oldItem , newItem)){
            System.out.println("Change it successful .");
        }else{
            System.out.println("failed");
        }
    }

    private static void removeItem(){
        System.out.println("what you want remove ? ");
        String removeItem = scanner.nextLine();
        if(userList.removeItem(removeItem)){
            System.out.println("item have been removed .");
        }else{
            System.out.println("remove failed .");
        }
    }

    private static void searchItem(){
        System.out.println("what item do you want to search ? ");
        String searchItem = scanner.nextLine() ;
        if(userList.findItem(searchItem)){
            System.out.println("You already have it . ");
        }else{
            System.out.println("You don't have it in your list . ");
        }
    }

    private static void copyArrayList(){
        //method 1 :
        ArrayList<String> arrayListOne = new ArrayList<String> () ;
        arrayListOne.addAll(userList.getGroceryList()) ;
        //method 2 :
        ArrayList<String> arrayListTwo = new ArrayList<String> (userList.getGroceryList()) ;
        //method 3 :
        String[] arrayThree = new String[userList.getGroceryList().size()] ;
        arrayThree = userList.getGroceryList().toArray(arrayThree) ;
    }

    private static void quitApp(){
        quit = true ;
        System.out.println("Nice to meet you , bye ~ ") ;
    }

}
