package com.dheeraj.DSA.Arrays;

import java.util.*;

 class main {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int[] arr = {map.get(target-nums[i]),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int[] ans = twoSum(nums,target);
        for(int ele : ans){
            System.out.print(ele +" ");
        }
    }
}
