package com.lewin;

public class Decoration {
//************************field**************************
    private String category ;

//************************constructor********************

    public Decoration(){
        this("flower") ;
    }
    public Decoration(String category) {
        this.category = category;
    }

//************************setter and getter**************

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

//**************************method***********************
    public void changeCategory(String category) {
        this.category = category ;
    }

}
