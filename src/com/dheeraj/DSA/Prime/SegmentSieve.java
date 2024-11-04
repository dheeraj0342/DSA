package com.dheeraj.DSA.Prime;

import java.util.ArrayList;

public class SegmentSieve {
    public static void main(String[] args) {
        int a = 22;
        int b = 78;
        int rootb =(int) Math.sqrt(b);
        ArrayList<Integer> primes = sieve(rootb);
        boolean[] arr = new boolean[b-a+1];
        for(int prime : primes){
            int multiple = (int)Math.ceil((a*1.0)/prime);
            if(multiple==1){
                multiple++;
            }
            int index = multiple * prime-a;
            for(int i=index; i<arr.length;i+=prime){
                arr[i] = true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false && i+a >1){
                System.out.println(i+a);
            }
        }
    }
    // sieves of eratosthenes
    public static ArrayList<Integer> sieve(int n){
        boolean[] arr = new boolean[n+1];
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=2; i*i< arr.length;i++){
            if(arr[i]==false){
                for(int j=2*i;j<arr.length;j+=i){
                    arr[j] = true;
                }
            }
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]==false){
                res.add(i);
            }
        }
        return res;
    }
}
