package com.dheeraj.DSA.LinkedList;

import com.dheeraj.DSA.LinkedList.FoldLinkedList.ListNode;


public class OddEven {
    public ListNode oddEven(ListNode head){
        if(head ==null || head.next == null) return head;

        ListNode odd = head , even = head.next , evenHead = head.next;

        while(even.next != null && even.next.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
