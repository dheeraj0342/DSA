package com.dheeraj.DSA.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3,'A','C','B');
    }
    public static void TOH(int n , char src , char dist , char helper){
        if(n==1){
            System.out.printf("MOVE %d FROM %c TO %c\n",n,src,dist);
            return;
        }
        TOH(n-1,src,helper,dist);
        System.out.printf("MOVE %d FROM %c TO %c\n",n,src,dist);
        TOH(n-1,helper,dist,src);
    }
}
