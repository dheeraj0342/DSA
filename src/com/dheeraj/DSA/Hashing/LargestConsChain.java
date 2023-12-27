package com.dheeraj.DSA.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LargestConsChain {
    public static void main(String[] args) {
        int[] arr ={2,6,7,4,3,10};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int ele : arr){
            hs.add(ele);
        }
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            if(!hs.contains(ele-1)) {
                int next = ele +1;
                int cnt=1;
                while(hs.contains(next)){
                    cnt++;
                    next++;
                }
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}
