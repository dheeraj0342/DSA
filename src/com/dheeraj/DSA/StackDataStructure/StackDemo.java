package com.dheeraj.DSA.StackDataStructure;

public class StackDemo {
    public static void main(String[] args) throws Exception{
        DynamicStack ds = new DynamicStack();
        ds.push(8);
        ds.push(9);
        ds.push(10);
        ds.pop();
        ds.display();
        System.out.println(ds.getsize());
    }

}
