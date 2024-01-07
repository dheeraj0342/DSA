package com.dheeraj.DSA.LinkedList;

public class SinglyLinkedList {

        private Node head;
        private Node tail;
        private int size=0;

        public void InsertFirst(int val){
            if(tail == null){
                tail = head;
            }
            Node node = new Node(val);
            node.next = head;
            head = node;
            size++;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("END");
        }
        public void InsertLast(int val){
            if(tail == null){
                InsertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;

            size++;

        }
        public void Insert(int val,int index){
            if(index ==0){
                InsertFirst(val);
                return;
            }
            else if(index == size ){
                InsertLast(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i <index ; i++) {
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;
            size++;

        }
        public Node get(int index){
            Node temp = head;
            for (int i = 0; i <index ; i++) {
                temp = temp.next;
            }
            return temp;
        }


        public int  DeleteFirst(){
            int val = head.val;
            head = head.next;
            if(head==null){
                tail = null;
            }
            return val;
        }
        public int DeleteLast(){
            if(size <=1){
                return DeleteFirst();
            }
            Node node = get(size-2);
            int val = node.val;
            node.next = null;
            return val;
        }
        public int Delete(int index){
            if(index ==0){
                return DeleteFirst();
            }
            else if(index == size-1){
                return DeleteLast();
            }
            Node node = get(index-1);
            int val = node.next.val;
            node.next=node.next.next;
            return val;



        }







    }


 class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}