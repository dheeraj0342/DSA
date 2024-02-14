package com.dheeraj.DSA.Queue;

public class CircularQueue {
    private int[] arr;
    private int front, rear;
    private int size;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = val;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        for (int i = front; i < front + size; i++) {
            System.out.print(arr[i % arr.length] + " ");
        }
        System.out.println();
    }




}
