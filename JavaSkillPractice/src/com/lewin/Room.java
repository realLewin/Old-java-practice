package com.lewin;

public class Room {

//**********************field*********************************
    private Wall theWall ;
    private Desk theDesk ;

//**********************constructor*******************
    public Room() {
        this(new Desk() , new Wall()) ;
    }
    public Room (Desk theDesk , Wall theWall){
        this.theDesk = theDesk ;
        this.theWall = theWall ;
    }

//************************setter and getter*************************
    public void setTheDesk(Desk theDesk){
        this.theDesk = theDesk ;
    }
    public Desk getTheDesk(){
        return this.theDesk ;
    }
    public void setTheWall(Wall theWall) {
        this.theWall = theWall ;
    }
    public Wall getTheWall(){
        return this.theWall ;
    }

//**************method********************************



}
