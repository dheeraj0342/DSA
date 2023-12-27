package com.dheeraj.DSA.Hashing;

import java.util.HashSet;
import java.util.SplittableRandom;

public class LargestUniqueString {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(solution(s));
    }
    public static int solution(String s){
        HashSet<Character> hs = new HashSet<>();
        int max =0;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j++));
                max =Math.max(max,hs.size());
            }
            else{
                hs.remove(s.charAt(i++));
            }
        }

       return max;
    }
}
