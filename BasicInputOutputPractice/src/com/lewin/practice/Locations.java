package com.lewin.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer , Location>{
    private static Map<Integer , Location> locations = new HashMap<>() ;

    static{
        Map<String , Integer> tempExits = new HashMap<String , Integer>() ;
        locations.put(0 , new Location(0 , "You just learning Java ..." , null)) ;
        
        tempExits = new HashMap<>() ; 
        tempExits.put("T" , 2) ;
        tempExits.put("L" , 3) ;
        tempExits.put("R" , 4) ;
        tempExits.put("B" , 5) ;
        locations.put(1 , new Location(1 , "You now at the Middle . " , tempExits)) ;

        tempExits = new HashMap<>() ;
        tempExits.put("M" , 1) ;
        tempExits.put("L" , 3) ;
        locations.put(2 , new Location(2 , "You now at the Top . " , tempExits)) ;

        tempExits = new HashMap<>() ;
        tempExits.put("T" , 2) ;
        locations.put(3 , new Location(3 , "You now at the Left . " , tempExits)) ;

        tempExits = new HashMap<>() ;
        tempExits.put("M" , 1) ;
        locations.put(4 , new Location(4 , "You now at the Right . " , tempExits)) ;

        tempExits = new HashMap<>() ;
        tempExits.put("M" , 1) ;
        tempExits.put("L" , 3) ;
        locations.put(5 , new Location(5 , "You now at the Bottom . " , tempExits)) ;

    }

















    @Override
    public int size() {
        return locations.size() ;
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty() ;
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key) ;
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value) ;
    }

    @Override
    public Location get(Object key) {
        return locations.get(key) ;
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key , value) ;
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
