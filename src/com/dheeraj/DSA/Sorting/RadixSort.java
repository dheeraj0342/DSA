package com.dheeraj.DSA.Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {4725, 4586, 1330, 8792, 1594, 5729};
        int max = Arrays.stream(arr).max().getAsInt();
        int [] output = new int[arr.length];

        for(int exp =1;max/exp>0;exp*=10){
            int [] count = new int[10];
            for(int i=0;i<arr.length;i++){
                count[(arr[i]/exp)%10]++;
            }
            for (int i = 1; i <10; i++) {
                count[i] = count[i] + count[i-1];
            }
            for (int i = arr.length-1; i >=0 ; i--) {
                output[count[(arr[i]/exp)%10]-1] = arr[i];
                count[(arr[i]/exp)%10]--;
            }
            System.arraycopy(output,0,arr,0,arr.length);
        }

        System.out.println(Arrays.toString(arr));
    }

}
