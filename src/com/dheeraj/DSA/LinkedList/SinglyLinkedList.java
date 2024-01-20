package com.dheeraj.DSA.LinkedList;

import com.sun.source.tree.BinaryTree;

public class SinglyLinkedList {

    private class Node{
        int item;
        Node next;

        Node(int item){
            this.item = item;
        }
    }

    private Node head;

    public boolean isEmpty(){
        return head==null;
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insertAtLast(int data) {
        Node n = new Node(data);
        Node temp = head;
        if (temp == null) head = n;
        else {
            while (temp.next != null)
                temp = temp.next;

            temp.next = n;
        }
    }

    public Node Search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.item == data)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void insertAt(Node t , int data){
        if(t != null){
            Node n = new Node(data);
            n.next = t.next;
            t.next = n;
        }
    }

    public void deleteFirst(){
        if(head !=null)
            head = head.next;
        else
            System.out.println("list is empty");
    }
    public void deleteLast(){
        Node temp = head;
        if(temp == null)
            System.out.println("list is empty");
        else if(head.next == null)
            head =null;
        while(temp.next.next!=null)
            temp = temp.next;
        temp.next = null;
    }

    public void delete(int data){
        Node t = Search(data);
        if(t == null)
            System.out.println("No item found");
        else{
            if(t == head)
                deleteFirst();
            else{
                Node temp = head;
                while(temp.next != t)
                    temp = temp.next;
                temp.next = t.next;
            }
        }
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.item+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

}
