package com.dheeraj.DSA.Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int val)throws Exception{
        if(isFull()){
            int[] temp = new int[data.length*2];
            System.arraycopy(data,0,temp,0,data.length);
            data = temp;
        }
        super.push(val);
    }
}
