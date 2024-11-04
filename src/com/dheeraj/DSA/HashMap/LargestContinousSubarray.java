package com.dheeraj.DSA.HashMap;

import java.util.HashSet;

public class LargestContinousSubarray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,6,0,0,1,2,3};
        int mlen=0;
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int max = arr[i];
            HashSet<Integer> set  =new HashSet<>();
            set.add(arr[i]);
            for (int j = i+1; j < arr.length ; j++) {
                if(set.contains(arr[j])) break;
                set.add(arr[j]);
                min = Math.min(min,arr[j]);
                max = Math.max(max,arr[j]);
                if(max - min == j-i){
                    int len = j-i+1;
                    if(len > mlen) mlen = len;
                }
            }
        }
        System.out.println(mlen);
    }
}
