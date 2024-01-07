package com.dheeraj.DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.Insert(4,1);
        System.out.println(list.Delete(1));
        list.display();

    }
}
