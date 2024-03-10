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

    public void deleteFirst() throws Exception {
        if(head == null)
            throw new Exception("List is empty");
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    public void deleteLast() throws Exception {
        if(head == null)
            throw new Exception("List is empty");
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=head){
            temp = temp.next;
        }
        temp.next = head;
    }

    public void delete(int index) throws Exception {
        if(head == null)
            throw new Exception("List is empty");
        if(index == 0){
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

}
