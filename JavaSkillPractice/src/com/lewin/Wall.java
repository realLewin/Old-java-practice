package com.lewin;

public class Wall {
//***************************field*******************************
    private String material ;
    private Decoration decoration ;

//***************************constructor*************************

    public Wall(){
        this("wood"  , new Decoration()) ;
    }
    public Wall(String material, Decoration decoration) {
        this.material = material;
        this.decoration = decoration ;
    }

//**************************setter and getter********************

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Decoration getDecoration() {
        return decoration;
    }
    public void setDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

//***************************method******************************
    public void changeDecoration(Decoration decoration){
        this.decoration = decoration ;
    }
}
