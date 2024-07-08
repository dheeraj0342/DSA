package com.dheeraj.DSA.Recursion;

import com.dheeraj.DSA.Tree.ConstructBinaryTree;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(superDigit("948",4));

    }

    public static int sum(int n) {
        if (n <= 9) {
            return n;
        }
        return n % 10 + sum(n / 10);
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
    public static boolean sumTillOne(int n) {
        return (n % 9 == 1);
    }


    // superDigit:
    public static int superDigit(String n , int k){
        if(n.length()==1)
            return Integer.parseInt(n);
        long sum=0;
        for(int i=0;i<n.length();i++){
            sum = sum + n.charAt(i)-'0';
        }
        sum *=k;
        return superDigit(String.valueOf(sum),1);
    }


}
