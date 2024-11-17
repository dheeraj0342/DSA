package com.dheeraj.DSA.Arrays;

import java.util.*;

public class TopkFreq {
        public static int[] topKFrequent(int[] nums, int k) {
            int n = nums.length;
            int[] res = new int[k];
            Map<Integer,Integer> map = new HashMap<>();
            for(int ele : nums){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
            List<Integer>[] buckets = new List[n+1];
            for(int i=0;i<=n;i++){
                buckets[i] = new ArrayList<>();
            }
            for(int key : map.keySet()){
                buckets[map.get(key)].add(key);
            }
            List<Integer> temp = new ArrayList<>();
            for(int i=buckets.length-1;i>=0;i--){
                List<Integer> list = buckets[i];
                for(int ele : list){
                    temp.add(ele);
                }
            }
            while(k-- >0){
                res[k] = temp.get(k);
            }
            return res;
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(Arrays.toString(topKFrequent(arr,k)));
    }
}
