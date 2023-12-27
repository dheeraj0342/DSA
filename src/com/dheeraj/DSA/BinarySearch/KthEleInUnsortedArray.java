package com.dheeraj.DSA.BinarySearch;

public class KthEleInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {9,1,4,10,8,56};
        int k =2;
        System.out.println(BS(arr,k));
    }
    public static int BS(int[]arr , int k){
        int s = min(arr);
        int e = max(arr);
        int ans =0;
        while(s<=e){
            int m = (s+e)/2;
            int cnt = count(arr, m);
            if(k > cnt)
                s = m+1;
            else if(cnt == k){
                ans = m;
                e = m-1;
            }
            else
                e = m-1;
        }
        return ans;
    }
    public static int min(int[]arr){
        int min =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
    public static int max(int[]arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > max)
                max= arr[i];
        }
        return max;
    }
    public static int count(int[]arr , int m){
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(m >=arr[i])
                cnt++;
        }
        return cnt;
    }


}
