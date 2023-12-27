package com.dheeraj.DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean isswapped = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    isswapped = true;
                }
            }
            if(!isswapped)
                break;

        }
    }
}
