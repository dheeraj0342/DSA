package com.dheeraj.DSA.LinkedList;

import com.dheeraj.DSA.LinkedList.FoldLinkedList.ListNode;
public class SegregateEvenOdd {
    public ListNode oddEvenList(ListNode head) {
        if(head ==null || head.next ==null) return head;

        ListNode evenDummy = new ListNode(-1);
        ListNode oddDummy = new ListNode(-1);

        ListNode evenTail = evenDummy;
        ListNode oddTail = oddDummy;
        ListNode curr = head;

        while(curr != null){
            if(curr.val % 2 != 0){
                oddTail.next = curr;
                oddTail = oddTail.next;
            }else{
                evenTail.next = curr;
                evenTail = evenTail.next;
            }
            curr = curr.next;
        }

        evenTail.next = oddDummy.next;
        oddTail.next = null;
        return evenDummy.next;
    }
}
