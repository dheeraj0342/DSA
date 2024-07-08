package com.dheeraj.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsetOfSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        printSubsetOfSum(arr,0,0,3,res,subres);
        System.out.println(res);
    }
    public static void  printSubsetOfSum(int[] arr , int idx , int sum , int target,List<List<Integer>> res,List<Integer> subres){
        if(idx==arr.length){
            if(sum==target){
                res.add(new ArrayList<>(subres));
            }
            return;
        }
        subres.add(arr[idx]);
        printSubsetOfSum(arr,idx+1,sum+arr[idx],target,res,subres);
        subres.remove(subres.size()-1);
        printSubsetOfSum(arr,idx+1,sum,target,res,subres);

    }

}
