package com.dheeraj.DSA.GCD;



public class GCD  {

    public static void main(String[] args) {
        System.out.println(gcdUsingIteration(6,36));
    }
    public static int gcdUsingRecusrion(int a ,int b){
        if(a==0)
            return b;
        return gcdUsingRecusrion(b % a , a);
    }
    public static int gcdUsingIteration(int a ,int b){
        while(a !=0){
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }

}
