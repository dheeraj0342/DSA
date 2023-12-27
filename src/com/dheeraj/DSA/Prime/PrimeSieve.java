package com.dheeraj.DSA.Prime;


public class PrimeSieve {
    public static void main(String[] args) {
        primeSieve(25);
    }

    public static void primeSieve(int N){
        boolean [] primes = new boolean[N+1];

        for (int i = 0; i <=N; i++) {
            primes[i] = true;
        }
        for (int j = 2; j*j <=N ; j++) {
            if(primes[j]== true){
                for (int k = j*j; k <=N; k=k+j) {
                    primes[k] = false;
                }
            }
        }
        for (int i = 2; i <N; i++) {
            if(primes[i]){
                System.out.print(i+ "  ");
            }
        }
    }

}

class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        int ans=0;
        for(int i=2;i<n;i++){
            if(arr[i]){
                ans++;
            }
        }
        return ans;
    }

}
