package com.dheeraj.DSA.Stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

    }
    public static boolean balancedBrackets(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch =='[' || ch =='{'){
                st.push(ch);
            } else if (ch ==')') {
                if(handleClosed(st,ch)==false)
                    return false;
            } else if (ch==']') {
                if(handleClosed(st,ch)==false)
                    return false;
            } else if (ch=='}') {
                if(handleClosed(st,ch)==false)
                    return false;
            }
        }
        if(st.size()==0)
            return true;
        else
            return false;
    }
    public static boolean handleClosed(Stack<Character> st , char ch){
        if(st.size()==0){
            return false;
        }else if(st.peek() !=ch){
            return false;
        }else{
            st.pop();
        }
        return true;
    }
}
