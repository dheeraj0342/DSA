package com.dheeraj.DSA.BitManipulation;

public class ElementPresentEvenTimesExceptTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};
        int xor=0;
        for (int i = 0; i< arr.length ; i++) {
            xor ^=arr[i];
        }
        int b=-1;
        for(int i=0;i<=31;i++){
            if(((xor>>i) & 1)==1){
                b=i;
                break;
            }
        }
        int x=0,y=0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]>>b & 1) ==1){
                x^=arr[i];
            }
            else{
                y^=arr[i];
            }
        }
        System.out.println(x + "," + y);

    }
}
