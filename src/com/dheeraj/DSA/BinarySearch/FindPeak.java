package com.dheeraj.DSA.BinarySearch;

public class FindPeak {
    public static void main(String[] args) {
        int[] arr ={1,2,1,3,4,6,5};
        System.out.println(findPeak(arr));

    }
    public static int findPeak(int[] arr){
        int s =0;
        int e = arr.length-1;
        while(s < e){
            int m = (s+e)/2;
            if(arr[m] > arr[m+1])
                e = m;
            else
                s = m+1 ;
        }
        return arr[s];

    }
}
