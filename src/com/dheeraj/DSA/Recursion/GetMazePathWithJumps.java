package com.dheeraj.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        System.out.println(getMazePathsWithJumps(0,0,2,2));
        printMazePathsWithJumps(0,0,2,2,"");
    }
    public static List<String> getMazePathsWithJumps(int sr , int sc , int dr , int dc){

        if(sr == dr && sc == dc){
            List<String > bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        List<String> res = new ArrayList<>();
        for(int i=1;i<=dc-sc;i++){
            List<String> hpaths = getMazePathsWithJumps(sr,sc+i,dr,dc);
            for(String path :hpaths) {
                res.add("h" + i + path);
            }
        }
        for(int i=1;i<=dr-sr;i++){
            List<String> vpaths = getMazePathsWithJumps(sr+i,sc,dr,dc);
            for(String path :vpaths) {
                res.add("v" + i + path);
            }
        }
        for(int i=1;i<=dc-sc && i<=dr-sr;i++){
            List<String> dpaths = getMazePathsWithJumps(sr+i,sc+i,dr,dc);
            for(String path :dpaths) {
                res.add("d" + i + path);
            }
        }
        return res;
    }
    public static void printMazePathsWithJumps(int sr ,int sc , int dr , int dc ,String res){
        if(sr==dr && sc == dc){
            System.out.print(res+" ");
            return;
        }
        for(int i=1;i<=dc-sc;i++){
            printMazePathsWithJumps(sr,sc+i,dr,dc,res+"h"+i);
        }
        for(int i=1;i<=dr-sr;i++){
            printMazePathsWithJumps(sr+i,sc,dr,dc,res+"v"+i);
        }
        for(int i=1;i<=dr-sr && i<=dc-sc;i++){
            printMazePathsWithJumps(sr+i,sc+i,dr,dc,res+"d"+i);
        }

    }
}
