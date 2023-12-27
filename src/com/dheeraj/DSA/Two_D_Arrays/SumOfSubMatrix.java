package com.dheeraj.DSA.Two_D_Arrays;

import java.util.Arrays;

public class SumOfSubMatrix {

    public static void main(String[] args) {
        int [] topleft = {1,2};
        int [] bottomright = {2,3};
        int [][] arr ={
                {1,2,3,4},
                {2,10,5,6},
                {5,67,8,9}
        };
        System.out.println(sumOfSubMatrix(arr,topleft,bottomright));
        System.out.println(Arrays.deepToString(prefixSum(arr)));
    }


    // Time Complexity : O(n*m)
    // Space Complexity : O(n*m)
    public static int  sumOfSubMatrix(int[][] arr, int[] topleft, int[] bottomright) {
        int sum =0;
        for(int i=topleft[0];i<=bottomright[0];i++){
            for(int j=topleft[1];j<=bottomright[1];j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }


    // sum of submatrix when multiple Queries are given then we use prefix sum technique:
    // To find prefix sum form l to r we use prefix[r] - prefix[l-1]

    // prefix sum of a matrix
    // Time Complexity : O(n*m)
    // Space Complexity : O(1)
    public static int[][] prefixSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] prefix = new int[n][m];
        prefix[0][0] = arr[0][0];
        for(int i=1;i<n;i++){
            prefix[i][0] = prefix[i-1][0] + arr[i][0];
        }
        for(int j=1;j<m;j++){
            prefix[0][j] = prefix[0][j-1] + arr[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                prefix[i][j] = prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1] + arr[i][j];
            }
        }
        return prefix;
    }

    public static int sumOfSubMatrixUsingPrefixSum(int[][] prefix, int[] topleft, int[] bottomright) {
        int sum =0;
        int r1 = topleft[0];
        int c1 = topleft[1];
        int r2 = bottomright[0];
        int c2 = bottomright[1];
        sum = prefix[r2][c2];
        if(r1>0){
            sum -= prefix[r1-1][c2];
        }
        if(c1>0){
            sum -= prefix[r2][c1-1];
        }
        if(r1>0 && c1>0){
            sum += prefix[r1-1][c1-1];
        }
        return sum;
    }

}
