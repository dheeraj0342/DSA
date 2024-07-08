package com.dheeraj.DSA.Recursion;



public class printPermutation {
    public static void main(String[] args) {
        printPermutation("abc","");
    }
    public static void printPermutation(String st , String res){
        if(st.length()==0){
            System.out.println(res);
            return;
        }

        for (int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            String rs = st.substring(0,i) + st.substring(i+1);
            printPermutation(rs,res+ch);
        }
    }
}
