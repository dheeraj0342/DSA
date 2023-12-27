package com.dheeraj.DSA.LinkedListDataStructure;

public class Main {
    public static void main(String[] args) {
        SLL myLL = new SLL();
        myLL.insertFirst(2);
        myLL.insertFirst(3);
        myLL.insertFirst(4);
        myLL.insertFirst(8);
        myLL.insertLast(9);
        myLL.insert(19,2);
        myLL.display();
        System.out.println(myLL.deleteLast());
        myLL.display();
        System.out.println(myLL.deleteFirst());
        myLL.display();
        System.out.println(myLL.delete(2));
        myLL.display();
        System.out.println(myLL.find(19));
    }
}
