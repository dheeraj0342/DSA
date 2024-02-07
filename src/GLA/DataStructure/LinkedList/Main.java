package GLA.DataStructure.LinkedList;

import com.dheeraj.DSA.Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.addLast(10);
//        ll.addLast(20);
//        ll.addFirst(0);
//        ll.add(2,1);
//        ll.display();

        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtLast(10);
        cll.insertAtLast(20);
        cll.insertAtLast(30);
        cll.display();

    }
}
