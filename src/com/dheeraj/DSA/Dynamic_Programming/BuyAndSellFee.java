package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class BuyAndSellFee {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }

        int fee = scn.nextInt();

        int obsp = -prices[0];
        int ossp = 0;
        for (int i = 1; i < n; i++) {
            int nbsp = 0;
            int nssp = 0;
            if(ossp - prices[i] > obsp){
                nbsp = ossp - prices[i];
            }else{
                nbsp = obsp;
            }
            if (obsp + prices[i] - fee > nssp) {
                nssp = obsp + prices[i] - fee;
            }else{
                nssp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }
}
