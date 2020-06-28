package com.lewin.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Location {
    private final int locationID  ;
    private final String description ;
    private final Map<String , Integer> exits ;

    public Location(int locationID , String description , Map<String , Integer> exits){
        this.locationID = locationID ;
        this.description = description ;
        if(exits != null){
            this.exits = exits ;
        }else{
            this.exits = new HashMap<String , Integer>() ;
        }
        this.exits.put("Q" , 0) ;
    }

    public int getLocationID() {
        return this.locationID;
    }
    public String getDescription(){
        return this.description ;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String , Integer> (exits) ;
    }
}
