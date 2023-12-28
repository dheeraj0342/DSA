package com.dheeraj.DSA.Arrays;

public class FindFirstPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findFirstPositiveMissingNumber(arr));
    }

    public static int findFirstPositiveMissingNumber(int []arr){
        int n = arr.length;
        int i=0;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i] >0 && arr[i]<n+1 && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return n+1; // important edge case
    }
   public static void swap(int[] arr , int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
   }


}
