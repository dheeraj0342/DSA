package com.dheeraj.DSA.StackDataStructure;

public class StackUsingArray {
    public int [] arr;
    int top;
    public  static final int DEFAULT_CAPACITY = 10;
    StackUsingArray(){
        arr = new int[DEFAULT_CAPACITY];
        top =-1;
    }
    StackUsingArray(int size){
        arr = new int[size];
        top =-1;
    }

    public int getsize(){
        return top + 1;
    }
    public boolean isEmpty(){
        return getsize()==0;
    }
    public void push(int data) throws Exception{
        if(getsize() == arr.length){
            throw new Exception("Stack is full!");
        }
        top++;
        arr[top] = data;
    }

    public void pop() throws Exception{
        if(getsize() == 0){
            throw new Exception("Stack is empty!");
        }
        top--;
    }
    public int peek() throws Exception{
        if(getsize() == 0){
            throw new Exception("Stack is empty!");
        }
        return arr[top];
    }

    public void display(){
        for(int i=getsize()-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



}
