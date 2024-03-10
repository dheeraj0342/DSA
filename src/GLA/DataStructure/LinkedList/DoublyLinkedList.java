package GLA.DataStructure.LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtStart(2);
        dll.insertAtStart(3);
        dll.insertAtStart(6);
        dll.insertAtEnd(5);
        dll.display();
//        dll.deleteFirst();
//        dll.deleteLast();
        dll.deleteAtMid();
        dll.display();
    }


    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

public void insertAtEnd(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;

            tail = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
   public void deleteLast(){
    if(head==null)
        return;
    if(head.next==null){
        head = null;
        tail=null;
        return;
    }
    Node temp = tail.prev;
    tail.prev = null;
    temp.next=null;
    tail=temp;
   }

    public void deleteFirst(){
        if(head==null)
            return;
        if(head.next==null){
            head = null;
            tail=null;
            return;
        }
        Node temp = head.next;
        head.next=null;
        temp.prev=null;
        head = temp;
    }

    public void deleteAtMid(){
        if(head == null){
            return ;
        }
        if(head.next ==null){
            head=null;
            tail=null;
            return ;
        }
        Node fast = head,slow = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp = slow.prev;
        temp.next=slow.next;
        slow.next.prev= temp;
        slow.prev=null;
        slow.next=null;
        slow=null;

    }


}
