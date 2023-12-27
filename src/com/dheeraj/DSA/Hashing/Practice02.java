package com.dheeraj.DSA.Hashing;

import java.util.HashSet;

public class Practice02 {
    public static void main(String[] args) {
        // Q: Find the NO. of unique Elements.

       /*
       Brute-Force approach:
       TC :O(N^2)
       SC : O(1)
        */

        /*
        Using HashSet:
        TC : O(N)
        SC : O(N)

         */

        int[] arr = {1, 2, 3, 1, 2, 5};
        System.out.println(practice(arr));

    }

    public static int practice(int[] arr) {
        HashSet<Integer> uniqueCount = new HashSet<>();
        for (int i : arr) {
            uniqueCount.add(i);
        }
        return uniqueCount.size();

    }
}

