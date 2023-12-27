package com.dheeraj.DSA.Arrays;

import java.util.HashSet;

public class Question1 {
    // Given an array of numbers in unordered way find the max len that has consecutive number.
    public static void main(String[] args) {
        int [] arr ={5,6,3,8,4,1,2,20,21};

        int maxlen =0;
        HashSet<Integer> set = new HashSet<>();
        for (int x: arr) {
            set.add(x);
        }
        for(int x : arr){
            if(set.contains(x-1) == false){
                int len =1;
                int num = x +1;
                while(set.contains(num)){
                    len ++;
                    num++;
                }
                maxlen = Math.max(maxlen ,len);
            }
        }
        System.out.println(maxlen);
    }
}
