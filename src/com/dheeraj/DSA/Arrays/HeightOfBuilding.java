package com.dheeraj.DSA.Arrays;

import java.util.Arrays;

public class HeightOfBuilding {
    public static void main(String[] args) {
        int[] arr = {6,4,3,5,1,7,3,5};
        int n = arr.length;
        int max = arr[n-1];
        int [] ans = new int[n];
        ans[n-1] =0;
        for (int i = n-2; i >=0 ; i--) {
            max = Math.max(max,arr[i]);
            ans[i] = max-arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
