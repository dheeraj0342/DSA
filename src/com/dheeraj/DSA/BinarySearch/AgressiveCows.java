package com.dheeraj.DSA.BinarySearch;

import java.util.Arrays;

public class AgressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1,2,4,8,9};
        int cows =3;
        System.out.println(agreesiveCows(stalls,cows));
    }
    public static int agreesiveCows(int[] stalls , int cows){
        Arrays.sort(stalls);
        int ans =0;
        int s =0;
        int e = stalls[stalls.length-1] - stalls[0];
        while(s<=e){
            int m = (s+e)/2;
            if(canPlace(stalls,cows,m)){
                ans = m;
                s = m+1;
            }
            else
                e = m-1;
        }
        return ans;
    }
    public static boolean canPlace(int[] stalls , int cows , int m){
        int cnt=1;
        int lastcow = stalls[0];
        for(int i = 1; i <=stalls.length-1 ; i++) {
            if(stalls[i] - lastcow >= m){
                cnt++;
                lastcow = stalls[i];
            }
            if(cnt == cows)
                return true;
        }
        return false;
    }
}
