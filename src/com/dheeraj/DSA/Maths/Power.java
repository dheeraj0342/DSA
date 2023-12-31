package com.dheeraj.DSA.Maths;

public class Power {
    public static void main(String[] args) {
        int a =3;
        int b=4;
        int m=1000;
        int ans=1;
        while(b>0){
            if(b % 2 ==1){
                ans = (ans * a) %m;
            }
            a = (a*a);
            b = b/2;
        }
        System.out.println(ans);
        System.out.println(power(a,b,m));
    }

    public static int  power(int a , int b , int m){
        if(b==0) {
            return 1;
        }
        int ans = power(a,b/2,m);
        ans = (ans * ans) % m;
        if(b % 2 ==1){
            ans = (ans * a) % m;
        }
        return ans;
    }






}
