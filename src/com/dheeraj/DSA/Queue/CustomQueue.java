package com.dheeraj.DSA.Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int size =0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    int ptr =0;

    public boolean isFull(){
        return ptr== data.length;
    }
    public boolean isEmpty(){
        return ptr == 0;
    }
    public void add(int val) throws Exception{
        if(isFull()){
            throw new Exception("Queue Is Full!");
        }
        data[ptr++] = val;
        size++;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Is Empty!");
        }
        size--;
        int removeval = data[0];
        for (int i = 1 ; i <ptr ; i++) {
            data[i-1] = data[i];
        }
        ptr--;
        return removeval;


    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Is Empty!");
        }
        return data[0];
    }

    public int size(){
        return size;
    }

    public void display(){
        for (int i = 0; i <ptr; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
