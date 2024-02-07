package GLA.DataStructure.Stack;

import GLA.DataStructure.LinkedList.LinkedList;

public class StackSUingll {

    class Node {
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;
    }
}

        class LinkedList {
            private Node head;

            public void addFirst(int data){
               Node node = new Node(data);
                node.next = head;
                head = node;

            }

            public void deleteFirst(){
                head = head.next;
            }

        }



    LinkedList ll;
    public StackSUingll() {
        ll =  new LinkedList();
    }

    public void push(int val){
        ll.addFirst(val);
    }

    public void pop(){
        ll.deleteFirst();
    }

    public int peek(){
        return ll.head.val;
    }

    public boolean isEmpty(){
        return ll.head == null;
    }

    public void display(){
        Node temp = ll.head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }



}
