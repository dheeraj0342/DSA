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
        int pivot = high;
        int i=low;
        int j=low;
        while(i<= high){
           if(arr[i] <= arr[pivot]){
               swap(arr,i,j);
               i++;
               j++;
           }else{
               i++;
           }
        }

        return j-1;


    }

    public static void swap(int[] arr ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
