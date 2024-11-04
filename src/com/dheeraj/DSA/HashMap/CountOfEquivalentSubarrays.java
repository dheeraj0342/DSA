package com.dheeraj.DSA.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class CountOfEquivalentSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,1};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums){
        int ans =0;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int k = set.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=-1;
        int j =-1;
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            while(i<nums.length-1){
                f1 = true;
                i++;
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                if(map.size()==k){
                    ans += nums.length-i;
                    break;
                }
            }
            while(j<i){
                f2 = true;
                j++;
                if(map.get(nums[j])==1){
                    map.remove(nums[j]);
                }else{
                    map.put(nums[j],map.get(nums[j])-1);
                }
                if(map.size()== k){
                    ans += nums.length-i;
                }else{
                    break;
                }
            }
            if(f1 ==false && f2==false){
                break;
            }
        }
        return ans;
    }
}
