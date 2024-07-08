package com.dheeraj.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GetStairPaths {
    public static void main(String[] args) {
        System.out.println(getStairPaths(4));
        System.out.println(getStairPaths(4));
    }
    public static List<String> getStairPaths(int n){

        if(n==0){
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n<0){
            return new ArrayList<String>();
        }
            List<String> paths1 = getStairPaths(n-1);
            List<String> paths2 = getStairPaths(n-2);
            List<String> paths3= getStairPaths(n-3);
            List<String> res = new ArrayList<>();

            for (int i = 0; i < paths1.size(); i++) {
                res.add(1+ paths1.get(i));
            }
            for (int i = 0; i < paths2.size(); i++) {
                res.add(2+ paths2.get(i));
            }
            for (int i = 0; i < paths3.size(); i++) {
                res.add(3 + paths3.get(i));
            }

        return res;

    }

    public static void printStiarPaths(int n , String res){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.print(res+" ");
            return;
        }
        printStiarPaths(n-1,1+res);
        printStiarPaths(n-2,2+res);
        printStiarPaths(n-3,3+res);

    }

}
