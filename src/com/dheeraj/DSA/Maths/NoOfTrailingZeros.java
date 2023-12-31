package com.dheeraj.DSA.Maths;

public class NoOfTrailingZeros {
    public static void main(String[] args) {
        int n=53;
        int d =5;
        int ans=0;
        while(n/d >0){
            ans += n/d;
            d*=d;
        }
        System.out.println(ans);

    }




}
