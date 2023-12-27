package com.dheeraj.DSA.Hashing;

import java.util.Arrays;

public class Practice04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 10, 12, 14};
        int k = 17;
        System.out.println(approach(arr, k));
    }

    public static boolean approach(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            int s = i + 1;
            int e = arr.length - 1;
            while (s < e) {
                if (arr[s] + arr[e] == k - arr[i]) {
                    s++;
                    e--;
                    return true;
                } else if (arr[s] + arr[e] > k - arr[i]) {
                    e--;
                } else {
                    s++;
                }
            }

        }
        return false;
    }
}
