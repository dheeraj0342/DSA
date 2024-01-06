package com.dheeraj.DSA.Sorting;

import java.util.Arrays;

// Time Complexity : O(NlogN)
// Space Complexity :O(N)
public class MergeSort {
    public static void main(String[] args) {
        int [] arr ={9,8,7,3,6,4,15,0,10};
        int n =arr.length;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr , int start , int end){
        if(start == end){
            return;
        }
        int mid = (start + end)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start, int mid , int end){
        int i=0,j=0;
        int n = mid-start+1;
        int m = end - mid;
        int [] left = new int[n];
        int[] right = new int[m];

        for (int k = 0; k < n; k++) {
            left[k] = arr[start+k];
        }
        for (int k = 0; k < m; k++) {
            right[k] = arr[mid+1+k];
        }
        int k=start;
        while(i<n && j<m){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}
