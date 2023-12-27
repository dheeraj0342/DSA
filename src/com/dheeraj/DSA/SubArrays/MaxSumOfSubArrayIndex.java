package com.dheeraj.DSA.SubArrays;

import java.util.Arrays;

public class MaxSumOfSubArrayIndex {
    public static void main(String[] args) {
    int[] arr= {0,1,2,-5,2};
        System.out.println(Arrays.toString(maxSumOfSubArrayIndex(arr)));
    }

    public static int[] maxSumOfSubArrayIndex(int[] arr) {
        int start = 0;
        int end = 0;
        int prevstart=0;
        int currsum = 0;
        int Maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
                prevstart = start;
                start = i+1;
            }
            Maxsum = Math.max(Maxsum, currsum);
            if (currsum >=Maxsum) {
                end = i;
            }

        }
        if(end < start){
            return  new int[] {prevstart,end};
        }
        return new int[] {start,end};
    }
}


