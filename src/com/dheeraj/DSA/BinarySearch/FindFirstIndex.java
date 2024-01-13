package com.dheeraj.DSA.BinarySearch;

public class FindFirstIndex {
    public static void main(String[] args) {
        int[] arr ={2,2,5,5,5,5,8,10,10,13,13,13};
        int target = 5;
        System.out.println(BinarySearch(arr,target));

    }
    public static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if((arr[mid] == target) && (mid ==0 || arr[mid]!=arr[mid-1]))
                return mid;
            if(arr[mid] < target)
                start = mid +1;
            else
                end = mid -1;
        }
        return -1;
    }
}
