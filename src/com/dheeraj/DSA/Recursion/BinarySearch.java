package com.dheeraj.DSA.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
    }
    public static int binarySearch(int[] arr , int target , int start , int end){
        if(start <=end){
            int mid = (start + end)/2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) return binarySearch(arr,target,start,mid-1);
            if(arr[mid] < target) return  binarySearch(arr,target,mid+1,end);
        }
        return -1;
    }
}
