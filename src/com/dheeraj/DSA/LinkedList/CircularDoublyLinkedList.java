package com.dheeraj.DSA.LinkedList;

public class CircularDoublyLinkedList {

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node start;

    public boolean isEmpty(){
        return start ==null;
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        if(isEmpty()){
            n.prev =n;
            n.next=n;
            start = n;
        }
        else{
            n.next = start;
            n.prev = start.prev;
            start.prev.next = n;
            start.prev = n;
            start = n;
        }

    }

    public void insertAtLast(int data){
        Node n = new Node(data);
        if(isEmpty()){
            n.prev =n;
            n.next=n;
            start = n;
        }
        else{
            n.next = start;
            n.prev = start.prev;
            start.prev.next = n;
            start.prev = n;
        }
    }

    public Node Search(int data){
        Node t = start;
        if(isEmpty())
            return null;
        do{
            if(t.val == data)
                return t;
            t = t.next;
        }while(t != start);
        return  null;
    }

    public void insertAfter(Node t , int data){
        if(t != null){
            Node n = new Node(data);
            n.next = t.next;
            n.prev = t;
            t.next.prev = n;
            t.next = n;
        }
    }

    public void deleteFirst(){
        if(!isEmpty()){
            if(start.next == start)
                start = null;
            else{
                start.prev.next = start.next;
                start.next.prev=start.prev;
                start = start.next;
            }
        }

    }

    public void deleteLast(){
            if(!isEmpty()){
                if(start.next == start)
                    start = null;
                else{
                    start.prev.prev.next = start;
                    start.prev = start.prev.prev;
                }
            }
    }

    public void delete(int data){
        Node t = Search(data);
        if(t != null){
            if(t == start)
                deleteFirst();
            else if(t == start.prev)
                deleteLast();
            else{
                t.next.prev = t.prev;
                t.prev.next = t.next;
            }
        }
    }

    public void display(){
        Node t = start;
        if(t != null){
            do{
                System.out.print(t.val+" ");
                t = t.next;
            }while (t != start);
            System.out.println();
        }
    }

}
