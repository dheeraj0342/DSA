package com.dheeraj.DSA.SubArrays;

import java.util.ArrayList;

public class PrintSubArray {
    public static void main(String[] args) {
        int [] arr={1,2,3};
       printSubArrays(arr);
    }


    public static void printSubArrays(int []arr){
        int n = arr.length;
        for(int i=0; i<(1<<n);i++){
            int j = arr.length-1;
            ArrayList<Integer>subarray = new ArrayList<>();
            int num = i;
            while(num>0){
                int index = (num& 1);
                if(index==1){
                    subarray.add(arr[j]);
                }
                j--;
                num= num>>1;
            }
            System.out.println(subarray);
        }

    }
}
