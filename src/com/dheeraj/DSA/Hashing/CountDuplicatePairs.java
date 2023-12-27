package com.dheeraj.DSA.Hashing;

import java.util.HashMap;

public class CountDuplicatePairs {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,4,4,1};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int cnt=0;
        for(int ele : arr){
            if(hm.containsKey(ele)){
                cnt += hm.get(ele);
                hm.put(ele , hm.get(ele) +1);
            }
            else {
                hm.put(ele,1);
            }
        }
        return cnt;
    }
}
