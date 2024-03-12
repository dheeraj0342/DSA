package com.dheeraj.DSA.Recursion;

public class CountSubSeq {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println(CountSubSeq(0,0,arr.length,3,arr));
    }

    public static int CountSubSeq(int i , int s , int n , int sum , int[] arr){
        if(i==n){
            if(s==sum)
                return 1;
            return 0;
        }
        s+=arr[i];
        int l=CountSubSeq(i+1,s,n,sum,arr);
        s-=arr[i];
        int r=CountSubSeq(i+1,s,n,sum,arr);
        return l+r;
    }
}
