package com.dheeraj.DSA.BinarySearch;

import java.util.Arrays;

public class FindPeak {
    public static void main(String[] args) {
        int[] arr ={1,2,1,3,8,6,7};
        System.out.println(BinarySearch(arr));


    }
    public static int BinarySearch(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s <=e){
            int m = (s + e)/2;
            if((m==0 || arr[m] >arr[m-1]) && (m==arr.length-1 || arr[m] >arr[m+1]))
                return m;
            if(m ==0 || arr[m] > arr[m-1])
                s = m+1;
            else
                e = m-1;
        }
        return -1;
    }

}
