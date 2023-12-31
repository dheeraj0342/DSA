package com.dheeraj.DSA.BitManipulation;

public class SumOfXorOfPair {
    public static void main(String[] args) {
        int [] arr ={3,6,5,8};
        int ans=0;
        for(int i=0;i<=31;i++){
            int x=0,y=0,pairs=0;
            for(int j=0;j<arr.length;j++){
                if((arr[j]>>i & 1) ==1){
                    x++;
                }
                else{
                    y++;
                }
            }
            pairs =x *y;
            ans += pairs * Math.pow(2,i);
        }
        System.out.println(ans);
    }
}
