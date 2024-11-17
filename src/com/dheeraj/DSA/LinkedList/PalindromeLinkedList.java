package com.dheeraj.DSA.LinkedList;


public class PalindromeLinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head== null || head.next ==null) return true;
        ListNode mid = midNode(head);
        ListNode nhead = mid.next;

        nhead = reverse(nhead);

        ListNode l = head;
        ListNode r = nhead;
        boolean res = true;
        while(l != null && r != null){
            if(l.val != r.val){
                res = false;
                break;
            }
            l= l.next;
            r= r.next;
        }
        nhead = reverse(nhead);
        mid.next = nhead;
        return res;
    }

    public ListNode midNode(ListNode head){
        if(head ==null || head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
