package com.dheeraj.DSA.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
 }

 // using reccursion :
 public static ListNode Reverse(ListNode head){
        if(head == null || head.next== null)
            return head;
        ListNode newHead = Reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head =  null;
        return newHead;
 }

}
