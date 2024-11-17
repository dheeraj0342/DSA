package com.dheeraj.DSA.LinkedList;

import com.dheeraj.DSA.LinkedList.FoldLinkedList.ListNode;
public class ReverseLinkedListAddFirst {

    static ListNode th = null;
    static ListNode tl = null;

    public static void addFirst(ListNode node){
        if(th == null){
            th = node;
            tl = node;
        }else{
            node.next = th;
            th = node;
        }
    }
     public static ListNode reverseLinkedList(ListNode head){
        ListNode curr = head;
        while(curr.next != null){
            ListNode forw = curr.next;
            curr.next = null;
            addFirst(curr);
            curr = forw;
        }
        return th;
     }

}
