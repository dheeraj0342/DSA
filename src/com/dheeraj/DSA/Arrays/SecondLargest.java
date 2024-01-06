package com.dheeraj.DSA.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {1,6,3,4,8};
        int n = arr.length;
        int first=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>first){
                second = first;
                first = arr[i];

            }
            else if (arr[i] > second && arr[i] < first) {
                    second = arr[i];
            }
        }
        System.out.println(second);
    }
}
