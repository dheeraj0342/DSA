package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class CoinChangeCombinations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int amt = scn.nextInt();
        int[] dp = new int[amt+1];
        dp[0] =1;
        for(int i=0;i<n;i++){
            for(int j=arr[i] ; j<dp.length;j++){
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[amt]);
    }
}
