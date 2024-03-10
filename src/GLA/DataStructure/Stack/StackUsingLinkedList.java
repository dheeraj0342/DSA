package GLA.DataStructure.Stack;

public class StackUsingLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void push(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    public void pop(){
        if(head == null){
            System.out.println("Stack is Empty");
        }
        else{
            head = head.next;
        }
    }
    public void peek(){
        if(head == null){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(head.data);
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedList sll = new StackUsingLinkedList();
        sll.push(2);
        sll.push(3);
        sll.push(6);
        sll.push(5);
        sll.display();
        sll.pop();
        sll.pop();
        sll.display();
        sll.peek();
    }
}