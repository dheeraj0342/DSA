package com.dheeraj.DSA.BinarySearch;

public class LazyWorkers {
    public static void main(String[] args) {
        int [] arr = {3,5,7,6,2,10};
        int k =3;
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
                e = m-1;
            }
            else
                s = m+1;
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
        int cnt=1;
        int t =0;
        for (int i = 0; i < arr.length; i++) {
            if(t + arr[i] <= m){
                t += arr[i];
            }
            else{
                t = arr[i];
                cnt++;
                if(cnt > k)
                    return false;
            }
        }
        return true;

    }

}
