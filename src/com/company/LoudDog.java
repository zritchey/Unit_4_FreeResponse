package com.company;

/**
 * Created by zachary on 1/31/2017.
 */
public class LoudDog extends Dog {
    public LoudDog(String name){
        super(name);
    }
    public String speak(){
        return super.speak()+" "+super.speak();
    }
}
