package com.dheeraj.DSA.Maths;

public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        int a=-1;
        int b=1;
        int sum =0;
        for(int i=0;i<n;i++){
            sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
