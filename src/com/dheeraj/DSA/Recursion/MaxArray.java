package com.dheeraj.DSA.Recursion;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1,67,89,0};
        System.out.println(msxOfArray(arr,0));
    }
    public static int msxOfArray(int[] arr , int i){
        if(i ==arr.length-1)
            return arr[i];
        int max = msxOfArray(arr,i+1);
        return max >arr[i] ? max : arr[i];
    }

}
