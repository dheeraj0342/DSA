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
    public static void quickSort(int[] arr , int low , int high){
        if(low < high){
            int pIndex = findParition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static int findParition(int[] arr ,int low , int high){
        int pivot = low;
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i] <= arr[pivot] && i<=high-1)
                i++;
            while(arr[j] > arr[pivot] && j >=low+1)
                j--;
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,pivot,j);
        return j;

    }

    public static void swap(int[] arr ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
