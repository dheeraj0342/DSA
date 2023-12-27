package com.dheeraj.DSA.Hashing;

import java.util.HashMap;

public class MinDistOfSameNum {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5,6,7};
        System.out.println(soluton(arr));
    }
    public static int soluton(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                int s = hm.get(arr[i]);
                min = Math.min(min, i-s);
                hm.put(arr[i],i);
            }
            else{
                hm.put(arr[i],i);
            }
        }
        return min;
    }
}
