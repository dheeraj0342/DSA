package com.dheeraj.DSA.Prime;

public class PrimeFactorization {
    public static void main(String[] args) {
        primeFactors(14);
    }
    public static void primeFactors(int n){
        for (int i = 2; i*i <n ; i++) {
            if (n % i ==0){
                int count=0;
                while(n % i==0){
                    count++;
                    n /=i;
                }
                System.out.printf("%d^%d X ",i,count);
            }

        }
        if(n >1){
            System.out.printf("%d^1",n);
        }
    }
}
