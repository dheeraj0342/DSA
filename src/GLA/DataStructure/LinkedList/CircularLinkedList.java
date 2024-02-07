package GLA.DataStructure.LinkedList;

public class CircularLinkedList {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public void insertAtFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            node.next = head;
        }
        else{
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
            head = node;
        }
    }

    public void insertAtLast(int data){
        Node node =new Node(data);
        if(head == null){
            head = node;
            node.next = head;
        }
        else{
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }

    }

    public void display(){
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public Node Middle(){
        Node slow = head;
        Node fast = head;
        while(fast.next!=head && fast.next.next!=head){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
