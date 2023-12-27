package com.dheeraj.DSA.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
//        System.out.println(towerOfHanoi(3));
//        System.out.println(toh(4));
        tohMoves(3,'A','B','C');
    }

    // using Recursion:
    public static long towerOfHanoi(int n){
        if(n ==0)
            return 0;
        return 2*towerOfHanoi(n-1) +1;
    }
    // using Bitwise Operator:
    public static int toh(int n){
        return (1 <<n) -1;
    }
    // print every move in tower of hanoi:
    public static void tohMoves(int n , char src , char hlpr , char dest){
        if(n==0)
            return;
        tohMoves(n-1,src,dest,hlpr);
        System.out.println("Move " + n + " From " + src+ " To "+dest);
        tohMoves(n-1,hlpr,src,dest);
    }
}
