package com.dheeraj.DSA.SubArrays;

import java.util.HashMap;

public class sumIsNum {

    public static void main(String[] args) {
        int [] arr={-3,9,0,6};
        System.out.println(sumIsNum(arr,6));
    }
    public static int sumIsNum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currsum = 0;
        int maxlen = 0;
        map.put(currsum, -1);
        currsum-=k;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (map.containsKey(currsum)) {
                int len = i - map.get(currsum);
                maxlen = Math.max(len, maxlen);
            } else {
                map.put(currsum, i);
            }
        }
        return maxlen;
    }
}

