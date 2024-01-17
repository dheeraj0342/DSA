package GLA.DataStructure.LinkedList;

public class LinkedList {
    class Node{
       int val;
       Node next;

        Node (int val){
            this.val = val;
        }
    }

    private Node head;
    private int size;

    //addLast
    public void addLast(int data){
        if(head == null) head = new Node(data);
        else{
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = new Node(data);
        }
        size++;
    }

    public void addFirst(int data){
            Node node = new Node(data);
            node.next = head;
            head = node;

    }

    public void add(int data , int index){
        Node temp = head;
        if(index ==0){
            addFirst(data);
            return;
        }
        if(index == size) {
            addLast(data);
            return;
        }
        for (int i = 0; i <index-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next= node;
    }
    //display
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // size
    public int size(){
       return size;
    }



}
