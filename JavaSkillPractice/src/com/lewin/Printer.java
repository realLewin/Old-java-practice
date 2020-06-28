package com.lewin;

public class Printer {
//**********************field************************************
    private double tonerLevel ;
    private int pageToPrint ;
    private boolean isDuplex ;

//**********************constructor******************************
    public Printer(double tonerLevel , int pageToPrint , boolean isDuplex){
        this.tonerLevel = tonerLevel ;
        this.pageToPrint = pageToPrint ;
        this.isDuplex = isDuplex ;
    }
//*******************setter and getter***************************
    public double getTonerLevel() {
        return tonerLevel;
    }
    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }
    public int getPageToPrint() {
        return pageToPrint;
    }
    public void setPageToPrint(int pageToPrint) {
        this.pageToPrint = pageToPrint;
    }
    public boolean isDuplex() {
        return isDuplex;
    }
    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
//********************method******************************
    public void changeTonerLevel(double changeLevel){
        if(changeLevel >0 && changeLevel <=1){
            this.tonerLevel = changeLevel ;
        }
    }
    public void changePageNumber(int pageToPrint){
        if(pageToPrint > 0){
            this.pageToPrint = pageToPrint ;
        }
    }

}
