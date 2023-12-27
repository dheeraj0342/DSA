package com.dheeraj.DSA.Combinatorics;

public class Question01 {
    // compute nCr :
    public static void main(String[] args) {
        System.out.println(leetcode(51,9));
    }
    public static int nCr(int n ,int r){
        int ans =1;
        for (int i = 0; i <r; i++) {
            ans = ans * (n-i);
            ans = ans / (i+1);
        }
        return ans;
    }
    public static int leetcode(int m ,int n){
        int min = m>n ? n : m;
        int max =(m+n)- min;
        int N = max + min -2;
        int ans =1;
        for(int i=0;i<min-1; i++){
            ans = ans *(N-i);
            ans = ans /(i+1);
        }
        return ans;
    }

}
