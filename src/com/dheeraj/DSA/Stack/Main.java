package com.dheeraj.DSA.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        DynamicStack stack = new DynamicStack(10);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(3);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(3);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(3);
        stack.pop();
        System.out.println( stack.size());

    }
}
