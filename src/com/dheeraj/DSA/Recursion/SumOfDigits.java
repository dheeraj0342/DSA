package com.dheeraj.DSA.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumTillOne(10));

    }
    public static int sum(int n){
        if(n<=9){
            return n;
        }
        return n%10 + sum(n/10);
    }

//    public static boolean sumTillOne(int n){
//        if(n<=9){
//            return (n==1);
//        }
//        return sumTillOne(sum(n));
//
//    }

    // Time Complexity : O(1)
    // Space Complexity : O(1)
    public static boolean sumTillOne(int n){
        return (n%9==1);
    }


}
