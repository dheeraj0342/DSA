package com.dheeraj.DSA.GCD;

import static com.dheeraj.DSA.GCD.GCD.gcdUsingIteration;

public class Question {
    // Given an array then find the maximum gcd by removing an element from array.

    public static void main(String[] args) {
        int [] arr={24,5,10,20,30};
        System.out.println(solution(arr));
    }
    public static int solution(int []arr){
        int N = arr.length;
        int[] pgcd = new int[N];
        int[] sgcd = new int[N];
        pgcd[0] = arr[0];
        for (int i = 1; i <N; i++) {
            pgcd[i] = gcdUsingIteration(arr[i],pgcd[i-1]);
        }

        sgcd[N-1] = arr[N-1];
        for (int i = N-2; i >=0; i--) {
            sgcd[i] = gcdUsingIteration(arr[i],sgcd[i+1]);
        }
        int ans=0;
        for (int i = 0; i < N; i++) {
            int leftgcd = i==0 ? 0: pgcd[i-1] ;
            int rightgcd = i==N-1 ? 0 : sgcd[i+1] ;
            int currgcd = gcdUsingIteration(leftgcd,rightgcd);
            ans = Math.max(ans,currgcd);
        }
        return ans;
    }
}
