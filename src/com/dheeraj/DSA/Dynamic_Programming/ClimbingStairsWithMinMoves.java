package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class ClimbingStairsWithMinMoves {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        Integer[] dp = new Integer[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i] >0){
                int min = Integer.MAX_VALUE;
                for(int j=1;j<=arr[i];j++){
                    if(dp[i+j] !=null){
                        min = Math.min(min,dp[i+j]);
                    }
                }
                if(min != Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
        }
        System.out.println(dp[0]);

    }
}
