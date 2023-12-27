package com.dheeraj.DSA.Recursion;

public class DissolveString {
    public static void main(String[] args) {
        String s ="aabaabb";
        System.out.println(dissolveString(s));
    }
    public static String dissolveString(String s){
        String bestOutput = s;
        for (int i = 0; i < s.length();) {
            int j=i;
            while(j<s.length() && s.charAt(j)==s.charAt(i)){
                j++;
            }
            if(j-i>1){
                String s_ = s.substring(0,i) + s.substring(j);
                String output = dissolveString(s_);
                if(output.length() < bestOutput.length()){
                    bestOutput = output;
                }
            }
            i=j;
        }
        return bestOutput;
    }
}
