package com.dheeraj.DSA.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortNearlykSortedArray {
    ArrayList<Integer> nearlySorted(int arr[], int num, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }
        for(int i=k+1;i<arr.length;i++){
            ans.add(pq.remove());
            pq.add(arr[i]);
        }
        while(pq.size()>0){
            ans.add(pq.remove());
        }
        return ans;
    }
}
