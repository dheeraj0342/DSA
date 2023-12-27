package com.dheeraj.DSA.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class Practice03 {
    public static void main(String[] args) {
        // Q : check if there is a pair (i,j) such that a[i]+a[j] == k and i !=j .


        int[] arr = {3,4,7};
        int k = 14;
        System.out.println(approach3(arr, k));

    }

    // using sort + 2 pointer:
//        TC : O(NlogN)
//        SC : O(1)
    public static boolean approach1(int[] arr, int k) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            if (arr[s] + arr[e] == k) {
                s++;
                e--;
                return true;

            } else if (arr[s] + arr[e] > k) {
                e--;
            } else {
                s++;
            }
        }
        return false;
    }

    // using hashset:
//    TC : O(N)
//    SC : O(N)
// here is a problem in this approach that we can;t know that is an element is of diff index .
    public static boolean approach2(int[] arr, int k) {
        HashSet<Integer> ele = new HashSet<>();
        for (int i : arr) {
            ele.add(i);
        }
        for (int i : arr) {
            if (ele.contains(k - i)) {
                return true;
            }
        }
        return  false;
    }
    // better approach as compare to approach 2
    public static boolean approach3(int[] arr, int k) {
        HashSet<Integer> ele = new HashSet<>();
        for(int i: arr){
            if(ele.contains(k-i)){
                return true;
            }
            ele.add(i);
        }
        return  false;
    }
}




