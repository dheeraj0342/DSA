package com.dheeraj.DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,6,3,2,4};
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i <n ;i++) {
            for (int j = 0; j <n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }

}
