package com.dheeraj.DSA.Recursion;

public class Occurence {
    public static void main(String[] args) {

    }
    public static int firstOcc(int[] arr, int i,int x){
        if(i==arr.length)
            return -1;

        return arr[i] == x ? arr[i] : firstOcc(arr,i+1,x);
    }

    public static int lastOcc(int[] arr, int i,int x){
        if(i==arr.length)
            return -1;
        int lastindex = lastOcc(arr,i+1,x);
        if(lastindex ==-1){
            if(arr[i]==x)
                return arr[i];
            else
                return -1;
        }
        else{
            return lastindex;
        }
    }
}
