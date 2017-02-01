package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(MathUtils.factorial(5)+"\n");
        System.out.println(MathUtils.power(2,3)+"\n");
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(MathUtils.triple(arr)));
        System.out.println("\n");
        Cat c=new Cat("Midnight");
        Dog d=new Dog ("Rowdy");
        LoudDog l=new LoudDog("Loud");
        System.out.println(c.getName()+" said "+c.speak());
        System.out.println(d.getName()+" said "+d.speak());
        System.out.println(l.getName()+" said "+l.speak());
    }
}
