package com.dheeraj.DSA.Queue;

public class CircularQueue {
    protected int[] data;
    private int size;

    protected int front=0,end =0;

    private static final int DEFUALT_SIZE = 10;

    public CircularQueue() {
        this(DEFUALT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int val) throws Exception{
        if(isFull()){
            throw new Exception("Queue Is Full!");
        }
        data[end++] = val;
        end = end % data.length;
        size++;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removeVal = data[front++];
        front = front % data.length;
        size--;
        return removeVal;
    }

    public int fornt() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        int i= front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i %= data.length;
        }while(i != end);
    }

}
