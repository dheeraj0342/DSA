package com.dheeraj.DSA.BinarySearch;

public class StackOfCoins {
    public static void main(String[] args) {
        int[] arr={10,20,30,10,15,10,10,10};
        int k = 3;
        System.out.println(BS(arr,k));
    }
    public static int BS(int[] arr, int k){
        int s = 0;
        int e =Sum(arr);
        int ans =0;
        while(s<=e){
            int m = (s+e)/2;
            if(Check(arr,m,k)){
                ans = m;
                s= m+1;
            }
            else
                e= m-1;
        }
        return ans;

    }
    public static int Sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static boolean Check(int[] arr , int m , int k){
        int cnt=0;
        int s =0;
        for (int i = 0; i < arr.length; i++) {
            if(s + arr[i] >=m){
                cnt++;
                s=0;
            }
            else{
                s += arr[i];
            }
        }
        return cnt == k+1;

    }
}
