package com.dheeraj.DSA.Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int []arr={1,2,5,4};
        System.out.println(isSorted(arr, arr.length));

    }
    public static boolean isSorted(int [] arr , int N){
        if(N== 0 || N ==1)
            return true;
        return arr[N-1]>arr[N-2] && isSorted(arr,N-1);
    }
}
