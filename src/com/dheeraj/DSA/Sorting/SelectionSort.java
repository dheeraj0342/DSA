package com.dheeraj.DSA.Sorting;

import java.util.Arrays;
import java.util.Objects;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,6,3,2,4};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
