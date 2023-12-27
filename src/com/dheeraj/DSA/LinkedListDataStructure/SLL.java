package com.dheeraj.DSA.LinkedListDataStructure;

public class SLL {
    private Node head;
    private Node tail;
    public int size;
    public SLL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail ==null) {
            tail = head;
        }
        size +=1;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insert(int val ,int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i <index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public int deleteLast(){
        if(size <=1){
            deleteFirst();
        }
        int val = tail.value;
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int  deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail =null;
        }
        size--;
        return val;
    }
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public int delete(int index){
        if(index ==0){
            deleteFirst();
        }
        if(index == size){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public void insertLast(int value){
        if(tail==null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next= node;
        tail = node;
        size++;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }

    }

}
