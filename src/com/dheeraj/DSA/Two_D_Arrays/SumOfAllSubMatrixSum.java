package com.dheeraj.DSA.Two_D_Arrays;


// contribution technique :
// 1. find how many times an element is contributing to the sum of all submatrices
// for 1D array it is : (i+1) * (n-i)
// for 2D array it is : (i+1) * (j+1) * (n-i) * (m-j)

public class SumOfAllSubMatrixSum {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3,4},{2,10,5,6},{5,67,8,9}};
        System.out.println(sumoOfAllSubMatrixSum(arr));

    }


    public static int sumoOfAllSubMatrixSum(int[][] arr){
        int sum=0;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j] * (i+1) *(j+1) *(n-i) *(m-j);
            }
        }
        return sum;
    }

}
