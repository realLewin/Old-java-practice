package com.lewin;

public class Dimension {

//****************************field*********************************
    private double height ;
    private double width ;

//****************************constructor***************************
    public Dimension(){
        this(1.80 , 1.40) ;
    }
    public Dimension(double height , double width) {
        this.height = height ;
        this.width = width ;
    }

//***************************setter and getter************************
    public void setHeight(double height){
        this.height = height ;
    }
    public double getHeight(){
        return this.height ;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

//***************************method*************************************
    public void changeDimension(double height , double width){
        this.height = height ;
        this.width = width ;
    }
}
