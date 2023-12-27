package com.dheeraj.DSA.Questions;

import java.util.HashMap;

public class DivisibleSubarray {
    public static void main(String[] args) {
        int [] arr={4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(arr,5));
    }    public static int subarraysDivByK(int[] nums, int k) {
        int result=0;
        int N = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ps =new int[N];
        for(int indx=0;indx <N;indx++){
            if(nums[indx]<0){
                nums[indx] = nums[indx] %k +k;
            }
        }
        ps[0] = nums[0];
        for (int i = 1; i <N ; i++) {
            ps[i] = ps[i-1]+nums[i];
        }
        for (int i = 0; i <N ; i++) {
            if(map.containsKey(ps[i]%k)){
                int value = map.get(ps[i]%k);
                map.put(ps[i]%k, value+1);
            }
            else{
                map.put(ps[i]%k ,1);
            }

        }
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value>=2){
                result+= (value *(value-1))/2;
            }
            else if(key==0){
                result++;
            }
        }
        return result;

    }

}
