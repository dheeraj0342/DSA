package com.dheeraj.DSA.BinarySearch;

public class BinarySearch {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,9};
        int target = 4;
        System.out.println(binarySearch(arr,target));
        }

    public static int binarySearch(int[] arr , int target) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int m = (s+e) / 2;
            if(arr[m] < target){
                s = m+1;
            }
            else if (arr[m] > target){
                e = m-1;
            }

            else{
                return m;
            }


        }
        return -1;
    }
}
