package com.company;

/**
 * Created by zachary on 1/31/2017.
 */
public abstract class Pet {
    private String myName;
    public Pet (String name){
        myName=name;
    }
    public String getName(){
        return myName;
    }
    public String speak(){
        return "";
    }
}
