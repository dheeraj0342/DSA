package com.dheeraj.DSA.Dynamic_Programming;

import java.util.Scanner;

public class PaintFence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(paintFence(n, k));
    }

    public static int paintFence(int n, int k) {
        if (n == 0) return 0;
        int same = 0;
        int diff = k;
        int total = same + diff;
        for (int i = 2; i <= n; i++) {
            same = diff;
            diff = total * (k - 1);
            total = same + diff;
        }
        return total;
    }
}

