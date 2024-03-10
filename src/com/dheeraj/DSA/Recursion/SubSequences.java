package com.dheeraj.DSA.Recursion;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> vals = new ArrayList<>();
        subSeq(0,arr,vals, arr.length);
    }

    public static void subSeq(int i , int[] arr , ArrayList<Integer> vals, int n){
        if(i==n){
            System.out.println(vals);
            return;
        }
        subSeq(i+1,arr,vals,n);
        vals.add(arr[i]);
        subSeq(i+1,arr,vals,n);
        vals.remove(vals.indexOf(arr[i]));

    }
}
