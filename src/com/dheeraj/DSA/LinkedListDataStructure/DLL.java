package com.dheeraj.DSA.LinkedListDataStructure;

public class DLL {

    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val +"->");
            node=node.next;
        }
        System.out.println("END");
    }
    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.insertFirst(7);
        ll.display();
    }
}
