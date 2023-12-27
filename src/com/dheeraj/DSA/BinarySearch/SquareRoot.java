package com.dheeraj.DSA.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(sqrtBS(n));
    }
    public static int sqrtBS(int n){
        int s=0;
        int e = n;
        int ans =0;
        while(s<=e){
            int m = (s+e)/2;
            if(m * m> n){
                e = m-1;
            }
            else{
                ans = m;
                s = m+1;
            }
        }
        return ans;
    }
}
