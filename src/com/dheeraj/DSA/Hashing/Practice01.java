package com.dheeraj.DSA.Hashing;

import java.util.HashMap;

public class Practice01 {
    public static void main(String[] args) {
        // Q: Find the first Non - repeating ELement .

       /*
       Brute-Force approach:
       TC :O(N^2)
       SC : O(1)
        */

        /*
        Using HashMap:
        TC : O(N)
        SC : O(N)

         */

        int [] arr ={1,2,3,1,2,5};
        System.out.println(practice(arr));



    }
    public static int practice(int[] arr){
        HashMap<Integer,Integer> repeatCount = new HashMap<>();
        for(int i : arr){
            if(repeatCount.containsKey(i)){
                int a =repeatCount.get(i);
                repeatCount.put(i,a+1);
            }
            else{
                repeatCount.put(i,1);
            }

        }

        for(int i : arr){
            if(repeatCount.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}
