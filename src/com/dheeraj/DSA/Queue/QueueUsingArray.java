package com.dheeraj.DSA.Queue;

public class QueueUsingArray {
    private int[] arr;
    private int front , rear;
    private int capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear =0;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return rear == capacity;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[rear++] = val;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[front];
        for (int i = 0; i < rear-1; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void display(){
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



}
