package com.dheeraj.DSA.Arrays;

import java.util.*;

public class leetcode {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(2);
        ans.add(3);
        System.out.println(ans);
        System.out.println(ans.indexOf(2));

    }
    public static List<List<Integer>> leetcode(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet();
        for(int i=0;i<(1<<3);i++){
            int j=nums.length-1;
            List<Integer> subset = new ArrayList<>();
            int num =i;
            while(num>0){
                if((num &1 )==1){
                    subset.add(nums[j]);
                }
                num = num>>1;
                j--;
                Collections.sort(subset);
            }
            set.add(subset);
        }
        for(List arr : set){
            result.add(arr);
        }
        return result;
    }
}
