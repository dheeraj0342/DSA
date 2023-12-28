package com.dheeraj.DSA.Arrays;

public class IntervalProblem {

    // Time complexiity : O(N)
    // Space complexity : O(1)
    public static void main(String[] args) {
        int [] start = {1,2,4,9,10,15,16};
        int [] end = {5,4,7,10,12,17,20};
        int n = start.length;
        int left = start[0];
        int right = end[0];
        for(int i=1;i<n;i++){
            if(start[i] <= right){
                right = Math.max(right,end[i]);
            }
            else{
                System.out.printf("[ %d , %d ]\n",left,right);
                left = start[i];
                right=end[i];
            }
        }
        System.out.printf("[ %d , %d ]\n",left,right);
    }
}
