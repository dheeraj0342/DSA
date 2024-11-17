package com.dheeraj.DSA.LinkedList;

public class UnFoldLinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void unFold(ListNode head){
        if(head ==null || head.next ==null) return;

        ListNode fh = head;
        ListNode fp = fh;

        ListNode sh = head.next;
        ListNode sp = sh;

        while(sp != null && sp.next != null){
            ListNode f = sp.next;

            fp.next = f;
            sp.next = f.next;

            fp = fp.next;
            sp = sp.next;
        }
        fp.next = null;

        sh = reverse(sh);
        fh.next = sh;
    }
    public ListNode reverse(ListNode head){
        if(head ==null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;

        while(curr != null){
            forw = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}
