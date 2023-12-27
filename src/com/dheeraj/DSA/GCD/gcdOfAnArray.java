package com.dheeraj.DSA.GCD;

import static com.dheeraj.DSA.GCD.GCD.gcdUsingIteration;

public class gcdOfAnArray {
    public static void main(String[] args) {
        int [] arr ={10,20,30,64};
        int gcd = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            gcd =gcdUsingIteration(gcd,arr[i]);
        }
        System.out.println(gcd);

    }
}
