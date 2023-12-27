package com.dheeraj.DSA.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countzeros(100291));
    }
    public static int countzeros(int n){
        return helper(n , 0);
    }
    public static int helper(int n , int cnt){
        if(n==0)
            return cnt;

        if(n % 10 == 0)
            return helper(n/10,cnt+1);
        return helper(n/10,cnt);
    }
}
