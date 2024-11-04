package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class unboundedKnapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int[] dp = new int[cap+1];

        for (int i = 1; i <dp.length ; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if(i >= wts[j]){
                    max = Math.max(max,dp[i-wts[i]]+vals[i]);
                }

            }
            dp[i] = max;
        }
    }


}
