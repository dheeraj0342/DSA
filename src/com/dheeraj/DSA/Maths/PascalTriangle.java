package com.dheeraj.DSA.Maths;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> ans= new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1){
                    subarray.add(1);
                }
                else{
                    subarray.add(ans.get(i-2).get(j-1) + ans.get(i-2).get(j));
                }
            }
            ans.add(subarray);
        }
        System.out.println(ans);
    }
}
