package com.dheeraj.DSA.BinarySearch;

public class RecurssiveBinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6,8,9};
        int tar = 4;
        System.out.println(recurrsiveBS(arr,tar,0, arr.length-1));
    }
    public static int recurrsiveBS(int[] arr , int tar , int s , int e){
        if(s > e)
            return -1;
        int m = (s+e)/2;
        if(arr[m] > tar)
           return  recurrsiveBS(arr,tar,s,m-1);
        else if (arr[m] < tar)
            return recurrsiveBS(arr,tar,m+1,e);
        else
            return m;

    }
}
