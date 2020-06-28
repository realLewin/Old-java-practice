package com.lewin;

public class BaseBurger {
//****************************field*********************************************
    private static final double basePrice = 5d ;
    private static final double smallAdditionPrice = 1d;
    private static final double midAdditionPrice = 2d;
    private static final double bigAdditionPrice = 3d;

    private double totalPrice = 0d ;
    private String burgerName ;

    private String burgerMeatType ;
    private String burgerMeatBeef = "beef" ;
    private String burgerMeatFish = "fish" ;
    private String burgerMeatPork = "pork" ;

    private String burgerBreadRollType ;
    private String burgerBreadRollBap = "bap" ;
    private String burgerBreadRollBun = "bun" ;
    private String burgerBreadRollBrioche = "brioche" ;

    private int additionTotalAmount = 0 ;
    private double additionTotalPrice = 0 ;
    private String additionEgg = "egg" ;
    private String additionTomato = "tomato" ;
    private String additionLettuce = "lettuce" ;
    private String additionCarrot = "carrot" ;
    private String additionSpinach = "spinach" ;
    private String additionMeat = "addition meat" ;
//**************************setter and getter**************************************

    public double getTotalPrice() {
        return totalPrice;
    }
    public String getBurgerName() {
        return burgerName;
    }
    public int getAdditionTotal() {
        return additionTotalAmount;
    }
    public double getAdditionTotalPrice() {
        return additionTotalPrice;
    }
    public String getBurgerMeatType() {
        return burgerMeatType;
    }
    public String getBurgerBreadRollType() {
        return burgerBreadRollType;
    }
    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }
//*************************constructor**********************************************
    public BaseBurger() {
        this("bap" , "pork" , "base burger") ;
    }
    public BaseBurger(String burgerRollType , String burgerMeatType , String burgerName) {
        this.burgerBreadRollType = burgerRollType ;
        this.burgerMeatType = burgerMeatType ;
        this.burgerName = burgerName;
    }
//************************method****************************************************
    public boolean chooseMeatType(String burgerMeatType) {
        this.burgerMeatType = burgerMeatType ;
        if(this.burgerMeatType.toLowerCase() == burgerMeatBeef || this.burgerMeatType.toLowerCase() == burgerMeatFish || this.burgerMeatType.toLowerCase() == burgerMeatPork) {
            return true ;
        }
        else{
            return false ;
        }
    }

    public boolean chooseBreadRollType(String burgerBreadRollType) {
        this.burgerBreadRollType = burgerBreadRollType ;
        if(this.burgerBreadRollType.toLowerCase() == burgerBreadRollBap || this.burgerBreadRollType.toLowerCase() == burgerBreadRollBrioche ||this.burgerBreadRollType.toLowerCase() == burgerBreadRollBun) {
            return true ;
        }
        else return false ;
    }

    public boolean chooseAdditionalItem(){
        this.additionTotalAmount = 0;
        this.totalPrice = this.basePrice + 0 ;
        System.out.println("No additional items chose .");
        return true ;
    }
    public boolean chooseAdditionalItem(String additionItem1){
        this.additionTotalAmount = 1 ;
        double additionItem1Price= calculateAdditionTotalPrice(additionItem1) ;
        this.totalPrice = this.basePrice + additionItem1Price ;
        System.out.println("you chose the " + additionItem1 + " with price " +additionItem1Price);
        return true ;
    }
    public boolean chooseAdditionalItem(String additionItem1 ,String additionItem2 ){
        this.additionTotalAmount = 2 ;
        double additionItem1Price= calculateAdditionTotalPrice(additionItem1) ;
        double additionItem2Price= calculateAdditionTotalPrice(additionItem2) ;
        this.totalPrice = this.basePrice + additionItem1Price + additionItem2Price ;
        System.out.println("you chose the " +additionItem1 +" with price " + additionItem1Price + " , " +additionItem2 + "with price "+additionItem2Price + " .");
        return true ;
    }
    public boolean chooseAdditionalItem(String additionItem1 , String additionItem2 , String additionItem3){
        this.additionTotalAmount = 3 ;
        double additionItem1Price= calculateAdditionTotalPrice(additionItem1) ;
        double additionItem2Price= calculateAdditionTotalPrice(additionItem2) ;
        double additionItem3Price= calculateAdditionTotalPrice(additionItem3) ;
        this.totalPrice = this.basePrice + additionItem1Price + additionItem2Price + additionItem3Price ;
        System.out.println("you chose the " +additionItem1 +" with price " + additionItem1Price + " , " +additionItem2 + "with price "+additionItem2Price +
                " , " + additionItem3 + "with price" + additionItem3Price +" .");
        return true ;
    }
    public boolean chooseAdditionalItem(String additionItem1 , String additionItem2 , String additionItem3 , String additionItem4){
        this.additionTotalAmount = 4 ;
        double additionItem1Price= calculateAdditionTotalPrice(additionItem1) ;
        double additionItem2Price= calculateAdditionTotalPrice(additionItem2) ;
        double additionItem3Price= calculateAdditionTotalPrice(additionItem3) ;
        double additionItem4Price= calculateAdditionTotalPrice(additionItem4) ;
        this.totalPrice = this.basePrice + additionItem1Price + additionItem2Price + additionItem3Price + additionItem4Price ;
        System.out.println("you chose the " +additionItem1 +" with price " + additionItem1Price + " , " +additionItem2 + "with price "+additionItem2Price +
                " , " + additionItem3 + "with price" + additionItem3Price +" , " + additionItem4 + "with price" + additionItem4Price + " .");
        return true ;
    }

    private double calculateAdditionTotalPrice(String item) {
            if(item == additionTomato || item == additionCarrot || item == additionLettuce || item == additionSpinach)
                return smallAdditionPrice ;
            if(item == additionEgg)
                return midAdditionPrice ;
            if(item == additionMeat)
                return bigAdditionPrice ;
            return -1 ;
    }

    public void sellNewBurger() {
        this.burgerName = null ;
        this.burgerMeatType = null ;
        this.burgerBreadRollType = null ;
        this.additionTotalPrice = 0 ;
        this.additionTotalAmount = 0 ;
        this.totalPrice = 0 ;
    }




}
