package com.dheeraj.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GetMazePath {
    public static void main(String[] args) {
        System.out.println(getMazePath(0,0,1,1));
        printMazePath(0,0,1,1,"");
    }
    public static List<String> getMazePath(int sr , int sc , int dr , int dc){

        if(sr == dr && sc == dc){
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(sr > dr || sc > dc){
            return new ArrayList<String >();
        }

        List<String> hPaths = getMazePath(sr,sc+1,dr,dc);
        List<String> vPaths = getMazePath(sr+1,sc,dr,dc);
        List<String> res =new ArrayList<>();

        for (int i = 0; i < hPaths.size(); i++) {
            res.add("h"+hPaths.get(i));
        }

        for (int i = 0; i < vPaths.size(); i++) {
            res.add("v"+vPaths.get(i));
        }
        return res;
    }
    public static  void printMazePath(int sr , int sc , int dr , int dc , String res){
        if(sr>dr || sc > dc)
            return;
        if(sr==dr && sc == dc) {
            System.out.print(res + " ");
            return;
        }
        printMazePath(sr, sc+1,dr,dc,res+"h");
        printMazePath(sr+1,sc, dr,dc,res+"v");
    }
}
