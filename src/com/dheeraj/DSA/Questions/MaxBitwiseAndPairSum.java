package com.dheeraj.DSA.Questions;

public class MaxBitwiseAndPairSum {
    public static void main(String[] args) {
        int []arr={16,24,2};
        MaxAndPairSum(arr);
    }
    public static void MaxAndPairSum(int []arr){
        int pattern = 0;
        for(int i=31;i>=0;i--){
            int count = 0;
            for(int ele : arr){
            if(((pattern|(1<<i)) & ele) == (pattern | (1<<i))){
                count++;
            }
        }
            if(count >1){
                pattern = ( pattern  | (1<<i));
            }

        }
        System.out.println(pattern);
    }

}
