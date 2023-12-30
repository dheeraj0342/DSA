package com.dheeraj.DSA.BitManipulation;

public class FindTwoElements {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 5, 3};
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        for (int i = 1; i <= n + 2; i++) {
            xor ^= i;
        }
        int b = -1;
        for (int i = 0; i <= 31; i++) {
            if ((xor >> i & 1) == 1) {
                b = i;
                break;
            }
        }
        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >> b) == 1) {
                x ^= arr[i];
            } else {
                y ^= arr[i];
            }
        }
        for (int i = 1; i <= n + 2; i++) {
            if ((i >> b) == 1) {
                x ^= i;
            } else {
                y ^= i;
            }

        }
        System.out.println(x +","+y);


    }
}
