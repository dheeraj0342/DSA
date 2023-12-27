package com.dheeraj.DSA.Questions;

public class TravelSalesmanProblem {
    public static void main(String[] args) {
        int arr[][] ={
                    {0,20,45,80},
                    {20,0,56,85},
                    {45,56,0,90},
                    {80,85,90,0}
                    };
        int mincost =minCost(arr,4,0,1);
        System.out.println(mincost);
    }
    public static int minCost(int arr[][],int n , int currentcity , int visited){
        // Base case:
        int cost =Integer.MAX_VALUE;
        if(visited == (1<<n)-1){
            return arr[currentcity][0];
        }
        for (int i = 0; i < n; i++) {
            if((visited & (1<<i)) ==0) {
                int currentCost = minCost(arr, n, i, visited | (1 << i)) + arr[currentcity][i];
                cost = Math.min(currentCost,cost);
            }
        }
        return cost;
    }
}
