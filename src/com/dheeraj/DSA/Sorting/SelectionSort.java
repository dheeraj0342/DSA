package com.dheeraj.DSA.Sorting;

import java.util.Arrays;
import java.util.Objects;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,6,3,2,4};
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            int maxId=0;
            for (int j = 1; j <=i ; j++) {
                if (arr[j] > arr[maxId]) {
                    maxId =j;
                }
                int temp = arr[i];
                arr[i] = arr[maxId];
                arr[maxId] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
