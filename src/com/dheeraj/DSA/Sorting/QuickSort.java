package com.dheeraj.DSA.Sorting;

import java.util.Arrays;

//No of levels : O(log(10/9) N)
// -> Time Complexity : O(N *log(10/9) N )
// -> Space Complexity :O(log(10/9) N)
// worst case :
// -> Time Complexity : O(N^2)
// -> Space Complexity :O(N)
public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={3,1,7,8,0,-1,-3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int start,int end){
        if(start>=end){
            return;
        }
        int pivotIndex = partition(arr,start,end);
        quickSort(arr,start,pivotIndex-1);
        quickSort(arr,pivotIndex+1,end);

    }
    public static int partition(int[] arr , int start,int end){
        int i=start;
        int pivot = arr[end];
        for (int j =start; j <end ; j++) {
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
            }

        }
        swap(arr,i,end);
        return i;
    }
    public static void swap(int[] arr ,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
