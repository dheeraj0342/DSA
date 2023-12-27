package com.dheeraj.DSA.StackDataStructure;

public class DynamicStack extends StackUsingArray{

    public DynamicStack() {
        super(DEFAULT_CAPACITY);
    }

    public DynamicStack(int capacity){
        super(capacity);
    }

    public void push(int item) throws Exception{
        if(getsize()== arr.length){
            int [] arr2 = new int[2 * arr.length];
            for(int i=0;i< this.getsize();i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        super.push(item);
    }

}
