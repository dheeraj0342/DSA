package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class BuyAndSell1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            min = Math.max(min,prices[i]);
           int  profit = prices[i] - min;
           if(profit > maxProfit)
               maxProfit = profit;

        }
        System.out.println(maxProfit);
    }
}
