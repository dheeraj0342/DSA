package com.dheeraj.DSA.Two_D_Arrays;

import java.util.Arrays;

public class StairCaseSearch {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3,4},{2,10,5,6},{5,67,8,9}};
        System.out.println(Arrays.toString(StairCaseSearch(arr,6)));
    }
    public static int[] StairCaseSearch(int[][] arr, int k){
        int N = arr.length;
        int M = arr[0].length;
        int i=0;
        int j =M-1;
        while(i<=N-1 && j>=0){
            if(arr[i][j] > k){
                j--;
            } else if (arr[i][j] < k) {
                i++;
            }
            return new int[] {i,j};
        }
        return new int[] {-1,-1};
    }
}
