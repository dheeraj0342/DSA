package com.dheeraj.DSA.BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(BS(piles,h));

    }
    public static int BS(int[] piles , int h){
        int s =1;
        int e = max(piles);
        int ans =0;
        while(s<=e){
            int m = (s+e)/2;
            int totaltime = totaltime(piles,m);
            if(totaltime <=h){
                ans = m;
                e =m-1;
            }
            else {
                s = m+1;
            }
        }
        return ans;
    }

    private static int totaltime(int[] piles, int m) {
        int time =0;
        for (int i = 0; i <piles.length; i++) {
            time += Math.ceilDiv(piles[i],m);
        }
        return time;
    }

    public static int max(int[] piles){
        int max = piles[0];
        for (int i = 1; i <=piles.length-1 ; i++) {
            if(max < piles[i])
                max = piles[i];
        }
        return max;
    }
}
