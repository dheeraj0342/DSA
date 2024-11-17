package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class BuyAndSellCoolDown {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }

        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0;

        for (int i = 1; i < n; i++) {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            if(ocsp - prices[i] > obsp){
                nbsp = ocsp - prices[i];
            }else{
                nbsp = obsp;
            }
            if(obsp + prices[i] > ossp){
                nssp = obsp +prices[i];
            }else{
                nssp = ossp;
            }
            if(ossp  > ossp){
                ncsp = ossp;
            }else{
                ncsp = ocsp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
    }
}
