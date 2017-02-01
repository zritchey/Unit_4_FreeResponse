package com.company;

/**
 * Created by zachary on 1/31/2017.
 */
public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }

    public String speak(){
        return dogSound;
    }
    private String dogSound="Bark";
}
