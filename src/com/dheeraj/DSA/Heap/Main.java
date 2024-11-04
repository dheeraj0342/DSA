package com.dheeraj.DSA.Heap;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {1,4,78,0,23,9};
        for(int ele : arr){
            pq.add(ele);
        }
        while(pq.size() >0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
