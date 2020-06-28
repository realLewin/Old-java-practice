package com.lewin;

public class Desk {

//*****************field**************************
    private String color ;
    private Dimension dimension ;

//*****************constructor********************
    public Desk(){
        this("yellow" , new Dimension()) ;
    }

    public Desk(String color, Dimension dimension) {
        this.color = color;
        this.dimension = dimension;
    }

//*****************setter and getter*****************

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

//*****************method************************
    public void changeDeskColor(String color){
        this.color = color ;
        System.out.println("Your desk color changed to : " + color ) ;
    }
}
