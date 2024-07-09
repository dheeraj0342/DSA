package com.dheeraj.DSA.Tree;

import java.util.*;
import java.util.List;

public class VerticalOrdering {
    static class Pair{
        ConstructBinaryTree.Node node;
        int hl = 0;
        Pair(ConstructBinaryTree.Node node , int hl){
            this.node = node;
            this.hl = hl;
        }
    }
    public static List<List<Integer>> verticalOrdering(ConstructBinaryTree.Node node){
        Queue<Pair> q = new ArrayDeque<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(new Pair(node,0));
        int min=0;
        int max=0;
        while(q.size()!=0){
            int size = q.size();
            while(size-->0){
                Pair rp=q.remove();
                max = Math.max(max,rp.hl);
                min = Math.min(min,rp.hl);
                map.putIfAbsent(rp.hl,new ArrayList<>());
                map.get(rp.hl).add(rp.node.data);
                if(rp.node.left!=null) q.add(new Pair(rp.node.left,rp.hl-1));
                if(rp.node.right!=null) q.add(new Pair(rp.node.right,rp.hl+1));

            }
        }
        for (int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
