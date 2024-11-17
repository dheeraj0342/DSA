package com.dheeraj.DSA.LinkedList;

import java.util.Scanner;

public class MidNode {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val , ListNode next){
            this.val = val;
            this.next =next;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(n -- >0){
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }
        ListNode head = midNode(dummy.next);
        if(head ==null){
            System.out.println("null");
        }else{
            System.out.println(head.val);
        }

    }

    public static ListNode midNode(ListNode head){
        if(head==null || head.next ==null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
