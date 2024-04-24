package com.dheeraj.DSA.Recursion;

import java.util.Scanner;

public class PowerLog {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powLog(x,n));
    }
    public static long powLog(int x,int n){
        if(n==0)
            return 1;
        long xnb2 = powLog(x,n/2);
        long xn = xnb2 * xnb2;
        if(n %2 ==1)
            xn = xn * x;
        return xn;
    }
}
