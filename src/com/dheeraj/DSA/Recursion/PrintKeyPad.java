package com.dheeraj.DSA.Recursion;

public class PrintKeyPad {
    public static void main(String[] args) {
        printKeyPad("23","");
    }
   static String[] phone = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printKeyPad(String keys , String res){
        if(keys.length()==0){
            System.out.print(res+" ");
            return;
        }
        char ch = keys.charAt(0);
        String nst = keys.substring(1);
        String letters = phone[ch-'0'];
        for(int i=0;i<letters.length();i++){
            printKeyPad(nst,letters.charAt(i)+res);
        }


    }
}
