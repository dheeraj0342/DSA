package com.dheeraj.DSA.Recursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
    printParenthesis(2,0,0,"");
    }
    // recurssion code to print valid parenthesis
    public static void printParenthesis(int n,int open , int close , String op){
        if(open+close == 2*n){
            System.out.println(op);
            return;
        }
        if(open <n){
            String op1 = op;
            op1 += "(";
            printParenthesis(n,open+1,close,op1);
        }
        if(close < open){
            String op2 = op;
            op2 += ")";
            printParenthesis(n,open,close+1,op2);
        }
    }


}
