package com.dheeraj.DSA.BitManipulation;

public class ElementPresentEvenTimes {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4,4,5,5};
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
