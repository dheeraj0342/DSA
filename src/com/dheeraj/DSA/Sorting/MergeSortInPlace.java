package com.dheeraj.DSA.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int [] arr={-9,10,789,92,-3,-3,-4};
        mergeSortInPlace(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInPlace(int[] arr ,int s , int e){
        if(s>=e)
            return ;

        int m = (s+e)/2;
        mergeSortInPlace(arr,s,m);
        mergeSortInPlace(arr,m+1,e);
        mergeInPlace(arr,s,m,e);

    }
    private static void mergeInPlace(int[] arr,int s , int m ,int e){
        int[] mergeArr = new int[e-s+1];
        int i=s;
        int j=m+1;
        int k=0;
        while(i<=m & j <=e){
            if(arr[i] < arr[j]){
                mergeArr[k] = arr[i];
                i++;
            }
            else{
                mergeArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <=m){
            mergeArr[k] = arr[i];
            i++;
            k++;
        }
        while(j <=e){
            mergeArr[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mergeArr.length; l++) {
            arr[s+l] = mergeArr[l];
        }
    }
}
