package com.dheeraj.DSA.Queue;

import com.dheeraj.DSA.Stack.DynamicStack;

public class Main{
    public static void main(String[] args)throws Exception {
//        CustomQueue queue = new CustomQueue();
//        queue.add(5);
//        queue.add(6);
//        queue.add(7);
//        queue.add(8);
//        queue.remove();
//        queue.display();
//
//        CircularQueue queue = new CircularQueue(5);
//        queue.add(5);
//        queue.add(6);
//        queue.add(7);
//        queue.add(8);
//        queue.add(9);
//        queue.remove();
//        queue.add(10);
//        queue.display();

        DynamicQueue queue = new DynamicQueue(5);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.remove();
        queue.add(10);
        queue.add(11);
        queue.display();

    }
}
