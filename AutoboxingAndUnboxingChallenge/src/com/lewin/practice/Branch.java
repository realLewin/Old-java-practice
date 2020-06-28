package com.lewin.practice;

import java.util.ArrayList;

public class Branch {
    private String branchName ;
    private ArrayList<Customer> customerList = new ArrayList<Customer>() ;

    public Branch(){
        this("default branch" , new ArrayList<Customer>()) ;
    }
    public Branch(String branchName , ArrayList<Customer> customerList){
        this.branchName = branchName ;
        this.customerList = customerList ;
    }

    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public boolean addNewCustomer(String userName , ArrayList<Double> userTransaction){
        if(customerList.add(new Customer(userName , userTransaction))){
            return true ;
        }
        return false ;
    }
    public boolean addNewTransaction(Customer customerName , double newTransaction){
        if(customerName.getUserTransaction().add(newTransaction)){
            return true ;
        }
        return false ;
    }
}
