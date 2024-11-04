package com.dheeraj.DSA.Heap;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueueUsingHeap {
    List<Integer> data;
    PriorityQueueUsingHeap(){
        data = new ArrayList<>();
    }
    public void add(int val){
        data.add(val);
        upHeapify(data.size()-1);
    }
    public void upHeapify(int i){
        if(i==0){
            return;
        }
        int pi = (i-1)/2;
        if(data.get(i) < data.get(pi)){
            swap(i,pi);
            upHeapify(pi);
        }
    }
    public void swap(int i , int j){
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i,jth);
        data.set(j,ith);
    }
    public void remove(){
        if(data.size()==0){
            System.out.println("underflow");
            return;
        }
        swap(0,data.size()-1);
        data.remove(data.size()-1);
        downHeapify(0);
    }
    public void downHeapify(int pi){
        int li = 2*pi+1;
        int ri = 2*pi+2;
        int min = pi;
        if(li <data.size() && data.get(li) < data.get(min)){
            min = li;
        }
        if(ri < data.size() && data.get(ri) < data.get(min)){
            min = ri;
        }
        if(min != pi){
            swap(pi,min);
            downHeapify(min);
        }
    }

    public int peek(){
        if(data.size()==0) {
            System.out.println("underflow");
            return -1;
        }
        return data.get(0);

    }
    public static void main(String[] args) {

    }
}
