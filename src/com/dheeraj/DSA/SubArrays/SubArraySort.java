package com.dheeraj.DSA.SubArrays;

import java.util.Arrays;

public class SubArraySort {
    public static void main(String[] args) {
        int [] arr ={1,2,4,3,2};
        System.out.println(Arrays.toString(subarraysort(arr)));
    }
    public static int[] subarraysort(int []arr){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(outOfOrder(arr,i)){
                smallest = Math.min(smallest,arr[i]);
                largest = Math.max(largest,arr[i]);
            }
        }
        if(smallest == Integer.MAX_VALUE) return new int[] {-1,-1};

        int left =0;
        while(smallest >= arr[left])
            left++;

        int right =arr.length-1;
        while (largest <= arr[right])
            right--;

        return new int[] {left,right};
    }

    public static boolean outOfOrder(int[] arr, int i){
        if(i==0) return arr[i] > arr[i+1];

        else if (i==arr.length-1) {
            return arr[i] < arr[i-1];
        }
        else{
            return arr[i] < arr[i-1] || arr[i] >arr[i+1];
        }
    }
}
