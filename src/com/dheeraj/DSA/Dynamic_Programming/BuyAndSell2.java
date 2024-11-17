package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class BuyAndSell2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }

        int ans=0;
        for (int i = 1; i < n; i++) {
            if(prices[i] > prices[i-1]){
                ans += prices[i] - prices[i-1];
            }
        }
        System.out.println(ans);
    }
}
