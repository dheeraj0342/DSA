package com.dheeraj.DSA.Maths;

public class Power {
    public static void main(String[] args) {
        int a =3;
        int b=1;
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

    }










}
