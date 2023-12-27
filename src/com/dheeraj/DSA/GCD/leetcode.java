package com.dheeraj.DSA.GCD;

public class leetcode {
    public static void main(String[] args) {
        int [] nums = {2,1,7,5};
        int min =nums[0];
        int max =nums[0];
        for(int ele : nums){
            if(ele < min){
                min = ele;
            }
            if(ele > max){
                max = ele;
            }
        }
        System.out.println(max + " " + min);
    }

}
