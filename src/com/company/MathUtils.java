package com.company;

/**
 * Created by zachary on 1/31/2017.
 */
public class MathUtils {
    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static int power(int base, int exp){
        if (exp==0)
            return 1;
        return base*power(base, exp-1);
    }
    public static int[] triple(int[]a){
        for (int i=0; i<a.length;i++){
            a[i]=tripleHelp(a[i],3);
        }
        return a;
    }
    private static int tripleHelp(int a, int indx){
        if (indx==0)
            return 0;
        return a+tripleHelp(a,indx-1);
    }
}
