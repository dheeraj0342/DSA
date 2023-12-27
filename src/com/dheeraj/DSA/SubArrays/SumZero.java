package com.dheeraj.DSA.SubArrays;

import java.util.HashMap;

public class SumZero {
    public static void main(String[] args) {
        int [] arr= {3,0,-1,-2,9};
        System.out.println(sumzero(arr));
    }
    public static boolean sumzero(int[] arr){
        HashMap map = new HashMap<>();
        int currsum=0;
        map.put(currsum,-1);
        for(int i =0 ; i<arr.length;i++){
            currsum += arr[i];
            if(map.containsKey(currsum)){
                return true;
            }
            else{
                map.put(currsum,i);
            }
        }
        return false;
    }
}
