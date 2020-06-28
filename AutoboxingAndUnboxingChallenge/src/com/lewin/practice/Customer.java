package com.lewin.practice;

import java.util.ArrayList;

public class Customer {
    private String userName ;
    private ArrayList<Double> userTransaction = new ArrayList<Double>() ;

    public Customer(){
        this("default" , new ArrayList<Double>()) ;//that fantastic .
    }
    public Customer(String userName , ArrayList<Double> userTransaction){
        this.userName = userName ;
        this.userTransaction = userTransaction ;
    }

    public void setUserTransaction(ArrayList<Double> userTransaction) {
        this.userTransaction = userTransaction;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public ArrayList<Double> getUserTransaction() {
        return userTransaction;
    }


}
