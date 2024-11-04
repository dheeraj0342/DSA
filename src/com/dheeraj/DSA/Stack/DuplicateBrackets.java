package com.dheeraj.DSA.Stack;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String s = "(a+b)+(c+d)";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }else{
                    while (st.peek() !='('){
                        st.pop();
                    }
                    st.peek();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
