package com.lewin;
//-----------------------------------------------------------------------------
class Car {
//*******************************************************
    private String carName ;
    private boolean isEngine ;
    private int wheelNumber ;
    private int cylinderNumber ;
//*******************************************************
    public Car (String carName , int cylinderNumber) {
        this.carName = carName ;
        this.isEngine = true ;
        this.wheelNumber = 4 ;
        this.cylinderNumber = cylinderNumber ;
    }
//****************************************************
    public String getCarName() {
        return carName;
    }
    public int getCylinderNumber() {
        return cylinderNumber;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }
//****************************************************
    public void startEngine(){
        this.isEngine = true ;
        if(isEngine){
            System.out.println("your engine start .");
        }
    }
    public void maxSpeed(){
        System.out.println("the common speed .");
    }
}
//------------------------------------------------------------------------------
class Lamborghini extends Car{
    private String carName ;

    public Lamborghini(String carName){
        super(carName , 8) ;
    }

    @Override
    public void maxSpeed(){
        System.out.println("the fastest");
    }
}

//---------------------------------------------------------------------------------
class Maserati extends Car{
    private String carName ;

    public Maserati(String carName){
        super(carName , 7) ;
    }

    @Override
    public void maxSpeed(){
        System.out.println("the second faster .");
    }
}

public class Main extends Object{

    public static void main(String[] args) {

//        Printer printer = new Printer(.5 , 20 , true) ;
//        System.out.println(printer.getPageToPrint());

//        for(int i = 0 ; i<10 ; i++) {
//            Car newCar = getRandomCar() ;
//            newCar.maxSpeed() ;
//        }
        Car newCar = new Lamborghini("excellent") ;
        newCar.maxSpeed();


    }

    public static Car getRandomCar(){
        int randomNumber = (int) (Math.random()*2 +1) ;
        switch(randomNumber){
            case 1:
                return (new Lamborghini("my favorite car")) ;
            case 2:
                return (new Maserati("wanted car .")) ;
            default:
                return (new Car("common car" ,4)) ;
        }
    }
}
