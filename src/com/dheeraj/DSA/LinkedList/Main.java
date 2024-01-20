package com.dheeraj.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
/*      SinglyLinkedList sll = new SinglyLinkedList();
         sll.insertAtStart(2);
         sll.insertAtLast(3);
         sll.display();

 */

      /*  DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst(2);
        dll.insertAtFirst(4);
        dll.insertAtFirst(7);
        dll.insertAtFirst(1);
        dll.insertAtLast(6);
        dll.delete(4);
        dll.display();

       */
        /*
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtFirst(1);
        cll.insertAtFirst(4);
        cll.insertAtLast(6);
        cll.insertAfter(cll.Search(1),2);
        cll.deleteLast();
        cll.display();

         */

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.insertAtStart(1);
        cdll.insertAtStart(2);
        cdll.insertAtStart(3);
        cdll.insertAtLast(4);
        cdll.insertAfter(cdll.Search(3),5);
        cdll.delete(1);
        cdll.display();

    }
}
