package com.dheeraj.DSA.Queue;

public class QueueUsingLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;

        }
    }

    private Node front;
    private Node rear;

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int val){
        Node node = new Node(val);
        if(isEmpty()){
            front = rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = front.data;
        front = front.next;
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
