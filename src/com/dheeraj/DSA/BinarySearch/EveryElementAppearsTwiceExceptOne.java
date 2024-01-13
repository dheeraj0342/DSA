package com.dheeraj.DSA.BinarySearch;

public class EveryElementAppearsTwiceExceptOne {
    public static void main(String[] args) {
        int[] arr ={2,2,5,5,8,7,7,9,9};
        System.out.println(BinarySearch(arr));

    }
    public static int BinarySearch(int[] arr){
        int s = 0;
        int e = arr.length-1;
       while(s <=e){
           int m = (s+e)/2;
           if((m==0 || arr[m] != arr[m-1]) && (m==arr.length-1 || arr[m]!=arr[m+1]))
               return m;
           if(m !=0 && arr[m] != arr[m-1]){
               if(m % 2==0)
                   e = m-1;
               else
                   s = m+1;
           }
           else{
               if(m % 2==0)
                   s = m+1;
               else
                   e = m-1;
           }
       }
       return -1;
    }
}
