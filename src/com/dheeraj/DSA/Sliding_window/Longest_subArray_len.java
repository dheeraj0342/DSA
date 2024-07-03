package com.dheeraj.DSA.Sliding_window;

public class Longest_subArray_len {
    public static void main(String[] args) {
        int[] arr =  {2,5,1,10,10};
        int s =14;
        int l=0;
        int r=0;
        int sum =0;
        int maxlen =0;
        while (r<arr.length){
            sum = sum + arr[r];
            while(sum >s){
                sum = sum - arr[l];
                l++;
            }
            if(sum <=s){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;
        }
        System.out.println(maxlen);
    }
}
