package com.dheeraj.DSA.TwoPointers;

public class FindCountOfPairSum {
    public static void main(String[] args) {
        int[] arr= {1,3,4,6,7,10,13,14,20};
        int k =17;
        System.out.println(twoPointer(arr,k));
    }
    public static int twoPointer(int[] arr , int k){
        int cnt =0;
        int i =0, j= arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == k){
                cnt++;
                i++;
                j--;
            }
            else if(arr[i] + arr[j] > k)
                j--;
            else
                i++;
        }
        return cnt;
    }
}
