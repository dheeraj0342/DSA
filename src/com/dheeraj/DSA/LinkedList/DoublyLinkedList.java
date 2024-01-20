package com.dheeraj.DSA.LinkedList;

public class DoublyLinkedList {
    private class Node{
        int item;
        Node next;
        Node prev;
        Node(int item){
            this.item = item;
        }
    }

    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void insertAtFirst(int data){
        Node node = new Node(data);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertAtLast(int data){
        Node node = new Node(data);
        Node temp = head;
        if(head == null){
            head = node;
        }
        else {
            while(temp.next!=null)
                temp = temp.next;
            node.prev = temp;
            temp.next = node;
        }
    }
    public Node Search(int data){
        Node t = head;
        while(t!=null){
            if(t.item == data)
                return t;
            t= t.next;
        }
        return null;
    }

    public void insertAfter(Node t , int data){
        if(t != null){
            Node node = new Node(data);
            node.prev = t;
            if(t.next != null)
                node.next = t.next;
            t.next = node;
        }
    }

    public void deleteFirst(){
        if(head !=null){
            if (head.next == null) {
                head = null;
            }
            else{
                head.next.prev = null;
                head= head.next;
            }
        }
    }

    public void deleteLast(){
        Node temp = head;
        if(head != null){
            if(temp.next==null){
                head = null;
            }
            else{
                while(temp.next.next != null)
                    temp= temp.next;
                temp.next = null;
            }
        }
    }
    public void delete(int data){
        Node t = Search(data);
        if(t !=null){
            if(t == head)
                head =null;
            else{
                t.prev.next = t.next;
                if(t.next!=null)
                    t.next.prev = t.prev;
            }
        }
    }

    public void display(){
        Node temp = head;
        System.out.print("<=>");
        while(temp != null){
            System.out.print(temp.item+"<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
