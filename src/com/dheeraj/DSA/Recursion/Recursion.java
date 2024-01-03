package com.dheeraj.DSA.Recursion;

public class Recursion {
    public static void main(String[] args) {


    }

    //  printing Number in Increasing order:
    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    // Printing NUmber in decreasing order:
    public static void printDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDec(n-1);

    }

    // Factorial:
    public static int  fact(int n){
        if(n==0) {
            return 1;
        }
       return  n * fact(n-1);
    }

    //  Tiling Problem:
    public static int  Tiling(int n){
        if(n== 1 || n== 2) {
            return n;
        }
        return  Tiling(n-1) + Tiling(n-2);
    }

//    Fibonacci Number
    public static int  fibo(int n){
        if(n== 0 || n== 1) {
        return n;
    }
        return  fibo(n-1) + fibo(n-2);
}

// fibonacci using loop:
public static void fiboLoop(int n){
    int a =0;
    int b =1;
    int sum =0;
    for (int i = 0; i < n-1; i++) {
        sum = a+b;
        a = b;
        b = sum;
    }
    System.out.println(a);
}

// sum upto N:
    public  static  int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }

    // String Palindrome or not:
    public static  boolean isPalindrome(String st , int i , int j ){
        if(i >= j){
            return true;
        }
        return (st.charAt(i) == st.charAt(j-1) && isPalindrome(st,i+1,j-1));
    }

    // a^n --> TC =O(N) and SC = O(N):
    public static int power(int a , int n ){
        if(n==0){
            return 1;
        }
        return a * power(a,n-1);
    }

    // a^n uisng TC : O(logN) and SC = O(logN) :
    public static int pow(int a , int n ){
        if(n==0){
            return 1;
        }
        int p = pow(a,n/2);
        if(n % 2==0){
            return p * p;
        }
        return a * p * p;
    }

    // (a^n) % p :
     public static  long powMod(int a , int n , int p){
        if(n==0){
            return 1;

        }
        long sp = powMod(a ,n/2,p);

        if(n % 2 ==0){
            return (sp * sp) % p;
        }
        return ((a % p) * (sp * sp) % p) % p;

    }


}
