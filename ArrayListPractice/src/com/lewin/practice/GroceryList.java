package com.lewin.practice;
import java.util.ArrayList;

public class GroceryList {
    //ArrayList method :
    //add , get , size , set , remove , contain , indexOf
    //----------------------------------------------------filed---------------------------------------------------------
    private ArrayList<String> groceryList = new ArrayList<String> () ;

    //--------------------------------------------------constructor-----------------------------------------------------
    public GroceryList(){
    }

    //-------------------------------------------------setter and getter------------------------------------------------
    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //-----------------------------------------------------method-------------------------------------------------------
    public void printList(){
        System.out.println("you have " + groceryList.size() + " item(s) in your list");
        for(String s : groceryList){
            System.out.println(s);
        }
    }
    public boolean addItem(String item){
        return groceryList.add(item) ;
    }
    public boolean findItem(String searchItem){
        return groceryList.contains(searchItem) ;
    }
    public boolean modifyItem(String oldItem , String newItem){
        if(groceryList.contains(oldItem)){
            groceryList.set(groceryList.indexOf(oldItem) , newItem) ;
            return true ;
        }
        return false ;
    }
    public boolean removeItem(String removeItem){
        return groceryList.remove(removeItem) ;
    }

}
