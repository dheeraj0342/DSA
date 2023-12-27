package com.dheeraj.DSA.Questions;

import java.util.HashMap;

public class FindPairsumDivByNum {
    public static void main(String[] args) {
        int [] arr={4,7,6,5,8,3,10,15};
        System.out.println(Solution(arr,5));
    }
    public static int Solution(int[] arr,int m){
        int pairs=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(arr[i]%m)){
                int value = map.get(arr[i]%m);
                map.put(arr[i]%m, value+1);
            }
            else{
                map.put(arr[i]%m ,1);
            }
        }
        pairs +=(map.get(0) *(map.get(0)-1))/2;
        for (int i = 1; i <=m/2; i++) {
            if(map.containsKey(m-i)){
                pairs += map.get(i) * map.get(m-i);
            }
        }
        if(m % 2==0){
            pairs += (map.get(m/2) * (map.get(m/2)-1))/2;
        }
        return pairs;
    }
}

