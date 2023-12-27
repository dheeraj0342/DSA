package com.dheeraj.DSA.StringPatternMatching;

import java.util.Arrays;
public class AlgoForLPS {
    public static void main(String[] args) {
        String str = "ababaa";
        int n =str.length();
        int[] lps = new int[n];
        lps[0]=0;
        for (int i = 1; i <n ; i++) {
            int x = lps[i];
            while(str.charAt(i) != str.charAt(x)){
                if(x==0){
                    x=-1;
                    break;
                }
                x= lps[x-1];
            }
            lps[i] = x+1;
        }
        System.out.println(Arrays.toString(lps));
    }

}
