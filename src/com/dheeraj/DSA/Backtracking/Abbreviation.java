package com.dheeraj.DSA.Backtracking;

public class Abbreviation {
    public static void main(String[] args) {
        printAbbreviation("pep",0,0,"");
    }
    public static void printAbbreviation(String st , int cnt , int pos , String res){
        if(pos==st.length()){
            if(cnt==0){
                System.out.println(res);
                return;
            }else{
                System.out.println(res+cnt);
                return;
            }
        }
        if(cnt>0)
            printAbbreviation(st , 0,pos+1,res +cnt + st.charAt(pos));
        else
            printAbbreviation(st,0,pos+1,res+st.charAt(pos));
        printAbbreviation(st,cnt+1,pos+1,res);
    }
}
