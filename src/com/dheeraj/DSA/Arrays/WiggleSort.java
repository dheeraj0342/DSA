package com.dheeraj.DSA.Arrays;

import java.util.Arrays;

public class WiggleSort {
    public static void main(String[] args) {
        int[] arr ={ 1, 2, 3, 4, 5 };
        for(int i=0;i<arr.length-1;i++){
            if(i % 2 ==0){
                if(arr[i+1] < arr[i]){
                    swap(arr,i+1,i);
                }
            }
            else{
                if(arr[i+1] > arr[i]){
                    swap(arr,i+1,i);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
