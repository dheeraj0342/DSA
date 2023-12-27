package com.dheeraj.DSA.SubArrays;

public class KadaneSalgo {
    public static void main(String[] args) {
        int[] arr ={3,7,5,0,-10};
        System.out.println(kadaneAlgo(arr));
    }
    public static int kadaneAlgo(int[]arr){
        int currsum =0;
        int Maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum+=arr[i];
            if(currsum <0) {
                currsum =0;
            }
            Maxsum =Math.max(Maxsum,currsum);

        }
        return Maxsum;
    }

}
