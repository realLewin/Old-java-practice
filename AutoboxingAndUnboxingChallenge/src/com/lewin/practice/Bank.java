package com.lewin.practice;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchList = new ArrayList<Branch>() ;

    public Bank(){
        this(new ArrayList<Branch>()) ;
    }
    public Bank(ArrayList<Branch> branchList){
        this.branchList = branchList ;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }
    public void setBranchList(ArrayList<Branch> branchList) {
        this.branchList = branchList;
    }

    public boolean addNewBranch(String branchName , ArrayList<Customer> customerList){
        if(branchList.add(new Branch(branchName , customerList))) {
            return true ;
        }
        return false ;
    }
    public void showCustomer(Branch branchName){
        Branch branchToShow = branchList.get(branchList.indexOf(branchName)) ;
        for(Customer i : branchToShow.getCustomerList()){
            System.out.println("customer name : " + i.getUserName() + " with transaction : " + i.getUserTransaction()) ;
        }
    }
}
