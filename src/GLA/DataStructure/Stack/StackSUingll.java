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
        }



    LinkedList ll;
    public StackSUingll() {
        ll =  new LinkedList();
    }
    public void push(int val){
        Node node = new Node(val);
        node.next = ll.head;
        ll.head = node;
    }
    public boolean isEmpty(){

        return ll.head == null;
    }


    public int pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return 0;
        }
        int val = ll.head.val;
        ll.head = ll.head.next;
        return val;

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        return ll.head.val;
    }


    public void display(){
        Node temp = ll.head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }



}
