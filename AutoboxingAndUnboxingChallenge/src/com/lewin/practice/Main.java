package com.lewin.practice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions
        ArrayList<Double> lewinTransaction = new ArrayList<Double> () ;
        lewinTransaction.add(100.0) ;
        Customer userLewin = new Customer("Lewin" , lewinTransaction) ;
        ArrayList<Double> ninaTransaction = new ArrayList<Double> () ;
        ninaTransaction.add(150.0) ;
        Customer userNina = new Customer("Nina" , ninaTransaction) ;

        ArrayList<Customer> branchOneCustomer = new ArrayList<Customer> () ;
        branchOneCustomer.add(userLewin) ;
        branchOneCustomer.add(userNina) ;
        Branch branchOne = new Branch("branchOne" , branchOneCustomer) ;
        ArrayList<Branch> bankOneBranch = new ArrayList<Branch> () ;
        branchOne.addNewTransaction(branchOne.getCustomerList().get(branchOne.getCustomerList().indexOf(userLewin)) , 300.0) ;
        bankOneBranch.add(branchOne) ;
        Bank bankOne = new Bank(bankOneBranch) ;

        bankOne.showCustomer(branchOne) ;


    }
}




























//another for loop
//for(double i = 0.0 ; i < 10.0 ; i += 0.5){}
/*-------------------------------------------Autoboxing and unboxing example--------------------------------------------
        Integer integerOne = new Integer(4) ;//not necessary .
        Integer integerTwo = 5 ; //Autoboxing .
        ArrayList<Integer> intArrayList = new ArrayList<Integer>() ;
        intArrayList.add(integerOne.intValue()) ; //not necessary .
        intArrayList.add(integerTwo) ; //unboxing .
        int intOne = integerOne.intValue() ;//not necessary .
        intOne = intArrayList.get(0).intValue() ;//not necessary .
        int intTwo = integerTwo ;// unboxing .
        intTwo = intArrayList.get(0) ; //unboxing .
 */