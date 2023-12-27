package com.dheeraj.DSA.BinarySearch;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9};
        int target = 4;
        System.out.println(floorBS(arr,target));
    }
    public static int floorBS(int[] arr , int target){
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m] > target)
                e = m -1;
            else if(arr[m] < target)
                s = m+1;
            else
                return arr[m] ;
        }
        return arr[e];

    }

}
