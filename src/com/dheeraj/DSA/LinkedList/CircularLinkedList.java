package com.dheeraj.DSA.LinkedList;

public class CircularLinkedList {
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }

    private Node last;
    int size=0;

    public boolean isEmpty(){
        return last == null;
    }

    public void insertAtFirst(int data){
        Node n = new Node(data);
        if(isEmpty()){
            n.next =n;
            last =n;
        }
        else{
            n.next = last.next;
            last.next =n;
        }
        size++;
    }

    public void insertAtLast(int data){
        Node n = new Node(data);
        if(isEmpty()){
            n.next =n;
        }
        else{
            n.next = last.next;
            last.next =n;
        }
        last = n;
        size++;
    }

    public Node Search(int data){
        if(!isEmpty()){
            Node temp = last.next;
           do{
                if(temp.val == data)
                    return temp;
                temp = temp.next;
            } while(temp != last.next);
        }
        return null;
    }

    public void insertAfter(Node t , int data){
        if(t != null){
            Node n = new Node(data);
            n.next = t.next;
            t.next = n;
            if(t == last)
                last =n;
        }
        size++;
    }

    public void deleteFirst() {
        if (last != null) {
            if (last.next == last) {
                last = null;
            } else {
                last.next = last.next.next;
            }
        }
    }
    public void deleteLast(){
            if(last != null){
                if(last.next == last) {
                    last = null;
                }
                else{
                    Node t=last;
                    while(t.next != last){
                        t=t.next;
                    }
                    t.next = last.next;
                    last = t;
                }
            }
        }
    public void delete(int data){
        Node t = Search(data);
        if(t != null){
            if(last.next == last){
                last = null;
            }
            else{
                if(t == last)
                    deleteLast();
                else{
                    Node temp = last.next;
                    while(temp != t){
                        temp = temp.next;
                    }
                    temp.next = t.next;
                }
            }
        }
    }

    public void display(){
        if(!isEmpty()){
            Node temp = last.next;
            do{
                System.out.print(temp.val+"->");
                temp = temp.next;
            }while(temp!= last.next);

        }
        else{
            System.out.println("empty ll");
        }


    }

    }





