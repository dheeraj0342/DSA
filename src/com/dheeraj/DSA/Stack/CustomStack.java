package com.dheeraj.DSA.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int size =0;

    public CustomStack() {
       this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    int ptr =-1;

    public boolean isFull(){
        return ptr== data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public void push(int val) throws Exception{
        if(isFull()){
            throw new Exception("Stack Is Full!");
        }
        ptr++;
        data[ptr] = val;
        size++;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Is Empty!");
        }
        size--;
        return data[ptr--];

    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Is Empty!");
        }
        return data[ptr];
    }

    public int size(){
        return size;
    }
}
